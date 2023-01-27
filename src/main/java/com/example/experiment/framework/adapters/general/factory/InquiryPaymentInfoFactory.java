package com.example.experiment.framework.adapters.general.factory;

import com.example.experiment.application.ports.output.InquiryPaymentInfoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InquiryPaymentInfoFactory {

    private final List<InquiryPaymentInfoOutputPort> inquiryPaymentInfoOutputPorts;

    public InquiryPaymentInfoOutputPort getPayment(String type) {
        return inquiryPaymentInfoOutputPorts.stream().filter(inquiryPaymentInfoOutputPort -> inquiryPaymentInfoOutputPort.getType().name().equals(type)).findAny().orElseThrow(() -> {
            throw new RuntimeException("Unknown service type: " + type);
        });
    }
}

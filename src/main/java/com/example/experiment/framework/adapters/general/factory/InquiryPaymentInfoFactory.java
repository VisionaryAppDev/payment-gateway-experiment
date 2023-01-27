package com.example.experiment.framework.adapters.general.factory;

import com.example.experiment.application.ports.output.InquiryProductDetailOutputPort;
import com.example.experiment.domain.vo.ProductType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InquiryPaymentInfoFactory {

    private final List<InquiryProductDetailOutputPort> inquiryProductDetailOutputPorts;

    public InquiryProductDetailOutputPort getPayment(ProductType type) {
        return inquiryProductDetailOutputPorts.stream().filter(inquiryProductDetailOutputPort -> inquiryProductDetailOutputPort.getType().name().equals(type.name())).findAny().orElseThrow(() -> {
            throw new RuntimeException("Unknown service productType: " + type);
        });
    }
}

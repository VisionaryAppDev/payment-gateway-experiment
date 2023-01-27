package com.example.experiment.framework.adapters.general.factory;

import com.example.experiment.application.ports.input.InquiryProductDetailInputPort;
import com.example.experiment.application.ports.output.InquiryProductDetailOutputPort;
import com.example.experiment.application.usecases.InquiryProductDetailUseCase;
import com.example.experiment.domain.vo.ProductType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InquiryProductDetailFactory {

    private final List<InquiryProductDetailOutputPort> inquiryProductDetailOutputPorts;

    public InquiryProductDetailUseCase getPayment(ProductType type) {
         InquiryProductDetailOutputPort inquiryProductDetailOutputPort1 = inquiryProductDetailOutputPorts.stream().filter(inquiryProductDetailOutputPort -> inquiryProductDetailOutputPort.getType().name().equals(type.name())).findAny().orElseThrow(() -> {
            throw new RuntimeException("Unknown service productType: " + type);
        });

         return new InquiryProductDetailInputPort(inquiryProductDetailOutputPort1);
    }
}

package com.example.experiment.framework.adapters.general.factory;

import com.example.experiment.application.ports.output.PaymentSettlementOutputPort;
import com.example.experiment.application.usecases.InquiryPaymentMethodUseCase;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentSettlementFactory {

    private final List<PaymentSettlementOutputPort> paymentSettlementOutputPorts;
    private final InquiryPaymentMethodUseCase inquiryPaymentMethodUseCase;

    public PaymentSettlementOutputPort getPaymentProviderByPaymentMethodId(Id id) {
        PaymentMethod paymentMethod = inquiryPaymentMethodUseCase.findById(id);

        return paymentSettlementOutputPorts.stream().filter(inquiryPaymentInfoOutputPort -> inquiryPaymentInfoOutputPort.getName().name().equals(paymentMethod.getPaymentProvider().getName())).findAny().orElseThrow(() -> {
            throw new RuntimeException("Unknown payment method Id: " + id);
        });
    }
}

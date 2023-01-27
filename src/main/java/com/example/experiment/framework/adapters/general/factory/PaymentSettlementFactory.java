package com.example.experiment.framework.adapters.general.factory;

import com.example.experiment.application.ports.input.PaymentSettlementInputPort;
import com.example.experiment.application.ports.output.PaymentSettlementOutputPort;
import com.example.experiment.application.usecases.InquiryPaymentMethodUseCase;
import com.example.experiment.application.usecases.PaymentSettlementUseCase;
import com.example.experiment.application.usecases.PriceCalculationUseCase;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.Id;
import com.example.experiment.domain.vo.ProductType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaymentSettlementFactory {

    private final List<PaymentSettlementOutputPort> paymentSettlementOutputPorts;
    private final InquiryPaymentMethodUseCase inquiryPaymentMethodUseCase;
    private final InquiryProductDetailFactory inquiryProductDetailFactory;
    private final PriceCalculationUseCase priceCalculationUseCase;

    public PaymentSettlementUseCase getPaymentProviderByPaymentMethodId(Id paymentMethodId, ProductType productType) {
        PaymentMethod paymentMethod = inquiryPaymentMethodUseCase.findById(paymentMethodId);
        PaymentSettlementOutputPort paymentSettlementOutputPort = paymentSettlementOutputPorts.stream().filter(inquiryPaymentInfoOutputPort -> inquiryPaymentInfoOutputPort.getName().name().equals(paymentMethod.getPaymentProvider().getName())).findAny().orElseThrow(() -> {
            throw new RuntimeException("Unknown payment method Id: " + paymentMethodId);
        });

        return new PaymentSettlementInputPort(inquiryProductDetailFactory.getPayment(productType), inquiryPaymentMethodUseCase, priceCalculationUseCase, paymentSettlementOutputPort);
    }
}

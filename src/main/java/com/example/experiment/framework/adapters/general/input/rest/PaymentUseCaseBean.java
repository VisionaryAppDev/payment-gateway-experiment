package com.example.experiment.framework.adapters.general.input.rest;

import com.example.experiment.application.ports.input.PaymentInputPort;
import com.example.experiment.application.ports.output.PaymentOutputPort;
import com.example.experiment.application.usecases.PaymentUseCase;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class PaymentUseCaseBean {

    public static final Map<String, PaymentUseCase> paymentUseCases = new HashMap<>();

    @PostConstruct
    public void paymentUseCase() {
        PaymentFactory.paymentOutputPortTypes().forEach(key -> {
            PaymentOutputPort paymentOutputPort = PaymentFactory.getPayment(key);
            PaymentInputPort paymentInputPort = new PaymentInputPort(paymentOutputPort);

            paymentUseCases.put(key, paymentInputPort);
        });
    }
}

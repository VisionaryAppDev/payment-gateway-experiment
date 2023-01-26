package com.example.experiment.framework.adapters.general.input.rest;

import com.example.experiment.application.ports.output.PaymentOutputPort;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class PaymentFactory {

    private final List<PaymentOutputPort> paymentUseCases;
    private static final Map<String, PaymentOutputPort> paymentOutputPorts = new HashMap<>();

    @PostConstruct
    public void initMyServiceCache() {
        for (PaymentOutputPort useCase : paymentUseCases) {
            paymentOutputPorts.put(useCase.getType().name(), useCase);
        }
    }

    public static PaymentOutputPort getPayment(String type) {
        PaymentOutputPort service = paymentOutputPorts.get(type);
        if (service == null) throw new RuntimeException("Unknown service type: " + type);
        return service;
    }

    public static Set<String> paymentOutputPortTypes() {
        return paymentOutputPorts.keySet();
    }
}

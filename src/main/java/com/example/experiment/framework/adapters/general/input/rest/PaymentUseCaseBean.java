package com.example.experiment.framework.adapters.general.input.rest;

import com.example.experiment.application.ports.input.PaymentInputPort;
import com.example.experiment.application.usecases.PaymentUseCase;
import com.example.experiment.framework.adapters.hotel.output.psql.PaymentPsqlAdapter;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaymentUseCaseBean {

    public static final Map<String, PaymentUseCase> paymentUseCases = new HashMap<>();

    @PostConstruct
    public void paymentUseCase(PaymentPsqlAdapter paymentPsqlAdapter) {
//        paymentUseCases.put("FLIGHT", new )
        paymentUseCases.put("HOTEL", new PaymentInputPort(paymentPsqlAdapter));
    }
}

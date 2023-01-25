//package com.example.experiment.framework.adapters.general.input.rest;
//
//import com.example.experiment.application.ports.output.PaymentOutputPort;
//import jakarta.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RequiredArgsConstructor
//@Service
//public class PaymentFactory {
//
//    private final List<PaymentOutputPort> paymentUseCases;
//    private static final Map<String, PaymentOutputPort> myServiceCache = new HashMap<>();
//
//    @PostConstruct
//    public void initMyServiceCache() {
//        for(PaymentOutputPort useCase : paymentUseCases) {
//            myServiceCache.put(useCase.getType(), useCase);
//        }
//    }
//
//    public static PaymentOutputPort getService(String type) {
//        PaymentOutputPort service = myServiceCache.get(type);
//        if(service == null) throw new RuntimeException("Unknown service type: " + type);
//        return service;
//    }
//}

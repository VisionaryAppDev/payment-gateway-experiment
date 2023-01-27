//package com.example.experiment.framework.adapters.general.factory;
//
//import com.example.experiment.application.ports.input.InquiryPaymentInfoInputPort;
//import com.example.experiment.application.ports.output.InquiryPaymentInfoOutputPort;
//import com.example.experiment.application.usecases.InquiryPaymentInfoUseCase;
//import com.example.experiment.framework.adapters.general.factory.InquiryPaymentInfoFactory;
//import jakarta.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RequiredArgsConstructor
//@Component
//public class InquiryPaymentInfoUseCaseBean {
//
////    public static final Map<String, InquiryPaymentInfoUseCase> paymentUseCases = new HashMap<>();
////    private final InquiryPaymentInfoFactory inquiryPaymentInfoFactory;
////
////    @PostConstruct
////    public void paymentUseCase() {
////        inquiryPaymentInfoFactory.paymentOutputPortTypes().forEach(key -> {
////            InquiryPaymentInfoOutputPort inquiryPaymentInfoOutputPort = inquiryPaymentInfoFactory.getPayment(key);
////            InquiryPaymentInfoInputPort paymentInputPort = new InquiryPaymentInfoInputPort(inquiryPaymentInfoOutputPort);
////
////            paymentUseCases.put(key, paymentInputPort);
////        });
////    }
//}

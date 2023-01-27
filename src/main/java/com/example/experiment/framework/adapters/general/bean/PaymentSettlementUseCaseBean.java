//package com.example.experiment.framework.adapters.general.bean;
//
//import com.example.experiment.application.ports.input.PaymentSettlementInputPort;
//import com.example.experiment.application.usecases.InquiryPaymentInfoUseCase;
//import com.example.experiment.application.usecases.InquiryPaymentMethodUseCase;
//import com.example.experiment.application.usecases.PaymentSettlementUseCase;
//import com.example.experiment.application.usecases.PriceCalculationUseCase;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//@RequiredArgsConstructor
//@Component
//public class PaymentSettlementUseCaseBean {
//    private final InquiryPaymentInfoUseCase inquiryPaymentInfoUseCase;
//    private final InquiryPaymentMethodUseCase inquiryPaymentMethodUseCase;
//    private final PriceCalculationUseCase priceCalculationUseCase;
//
//    @Bean
//    public PaymentSettlementUseCase PaymentSettlementInputPort() {
//        return new PaymentSettlementInputPort(inquiryPaymentInfoUseCase, inquiryPaymentMethodUseCase, priceCalculationUseCase);
//    }
//}

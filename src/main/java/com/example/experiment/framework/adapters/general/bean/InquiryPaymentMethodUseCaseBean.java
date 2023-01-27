package com.example.experiment.framework.adapters.general.bean;

import com.example.experiment.application.ports.input.InquiryPaymentMethodInputPort;
import com.example.experiment.application.ports.output.InquiryPaymentMethodOutputPort;
import com.example.experiment.application.usecases.InquiryPaymentMethodUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InquiryPaymentMethodUseCaseBean {

    @Bean
    public InquiryPaymentMethodUseCase inquiryPaymentMethodUseCase(@Autowired InquiryPaymentMethodOutputPort inquiryPaymentMethodOutputPort) {
        return new InquiryPaymentMethodInputPort(inquiryPaymentMethodOutputPort);
    }
}

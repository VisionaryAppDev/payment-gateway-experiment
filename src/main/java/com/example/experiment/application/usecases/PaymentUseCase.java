package com.example.experiment.application.usecases;

import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.PaymentInquiryResponse;

public interface PaymentUseCase {
    PaymentInquiryResponse inquiry(PaymentInquiryRequest paymentInquiryRequest);

//    void pay();
}

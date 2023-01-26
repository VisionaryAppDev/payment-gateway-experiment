package com.example.experiment.application.usecases;

import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.PaymentInquiryResponse;
import com.example.experiment.domain.vo.PaymentRequest;

public interface PaymentUseCase {
    PaymentInquiryResponse inquiry(PaymentInquiryRequest paymentInquiryRequest);

    void pay(PaymentRequest paymentRequest);
}

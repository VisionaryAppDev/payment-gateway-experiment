package com.example.experiment.application.usecases;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.vo.PaymentInquiryRequest;

public interface InquiryPaymentInfoUseCase {
    PaymentDetail inquiry(PaymentInquiryRequest paymentInquiryRequest);
}

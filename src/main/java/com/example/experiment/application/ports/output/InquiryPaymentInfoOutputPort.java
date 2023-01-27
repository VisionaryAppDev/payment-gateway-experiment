package com.example.experiment.application.ports.output;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.ProductType;

public interface InquiryPaymentInfoOutputPort {
    PaymentDetail inquiry(PaymentInquiryRequest paymentInquiryRequest);

    ProductType getType();
}

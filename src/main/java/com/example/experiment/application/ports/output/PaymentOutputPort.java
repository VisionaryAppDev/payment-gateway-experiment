package com.example.experiment.application.ports.output;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.ProductCode;

import java.util.List;

public interface PaymentOutputPort {
    PaymentDetail retrievePaymentDetail(PaymentInquiryRequest paymentInquiryRequest);
    List<PaymentMethod> retrieveAvailablePaymentMethod(ProductCode productCode);
//    String getType();
}

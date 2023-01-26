package com.example.experiment.domain.vo;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;

import java.util.List;

public record PaymentInquiryResponse(PaymentDetail paymentDetail, List<PaymentMethod> paymentMethod, List<PaymentPriceSummary> priceSummaries) {

}

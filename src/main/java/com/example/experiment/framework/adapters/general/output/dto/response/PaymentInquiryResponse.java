package com.example.experiment.framework.adapters.general.output.dto.response;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.PaymentPriceSummary;

import java.util.List;

public record PaymentInquiryResponse(PaymentDetail paymentDetail, List<PaymentMethod> paymentMethods, List<PaymentPriceSummary> paymentPriceSummaries) {

}

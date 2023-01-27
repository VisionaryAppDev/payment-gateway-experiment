package com.example.experiment.application.usecases;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.PaymentPriceSummary;

import java.util.List;

public interface PriceCalculationUseCase {
    List<PaymentPriceSummary> calculate(PaymentDetail paymentDetail, List<PaymentMethod> paymentMethod);

    PaymentPriceSummary calculate(PaymentDetail paymentDetail, PaymentMethod paymentMethod);
}

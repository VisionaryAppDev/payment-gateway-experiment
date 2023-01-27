package com.example.experiment.application.ports.output;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.PaymentPriceSummary;
import com.example.experiment.domain.vo.PaymentProviderName;
import com.example.experiment.domain.vo.SettlementResponse;

public interface PaymentSettlementOutputPort {

    SettlementResponse settle(PaymentDetail paymentDetail, PaymentMethod paymentMethod, PaymentPriceSummary priceSummary);
    PaymentProviderName getName();
}

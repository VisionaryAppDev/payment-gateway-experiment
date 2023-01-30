package com.example.experiment.framework.adapters.general.output.rest;

import com.example.experiment.application.ports.output.PaymentSettlementOutputPort;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.PaymentPriceSummary;
import com.example.experiment.domain.vo.PaymentProviderName;
import com.example.experiment.domain.vo.SettlementResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AbaPaymentSettlementAdapter implements PaymentSettlementOutputPort {

    @Override
    public SettlementResponse settle(PaymentDetail paymentDetail, PaymentMethod paymentMethod, PaymentPriceSummary priceSummary) {
        /// HTTP request to ABA ...

        /// return response
        return new SettlementResponse("ABA: " + UUID.randomUUID(), LocalDateTime.now());
    }

    @Override
    public PaymentProviderName getName() {
        return PaymentProviderName.ABA;
    }
}

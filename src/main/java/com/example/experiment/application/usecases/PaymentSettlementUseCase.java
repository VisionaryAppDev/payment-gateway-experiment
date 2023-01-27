package com.example.experiment.application.usecases;

import com.example.experiment.domain.vo.PaymentSettlementRequest;
import com.example.experiment.domain.vo.SettlementResponse;

public interface PaymentSettlementUseCase {
    SettlementResponse settle(PaymentSettlementRequest paymentSettlementRequest);
}

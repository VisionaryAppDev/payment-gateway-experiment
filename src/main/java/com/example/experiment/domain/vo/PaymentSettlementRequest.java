package com.example.experiment.domain.vo;

public record PaymentSettlementRequest(ProductCode productCode, String type, Id paymentMethodId) {
}


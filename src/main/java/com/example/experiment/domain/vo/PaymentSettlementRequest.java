package com.example.experiment.domain.vo;

public record PaymentSettlementRequest(String productCode, ProductType productType, Id paymentMethodId) {
}


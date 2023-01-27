package com.example.experiment.domain.vo;

public record PaymentSettlementRequest(ProductCode productCode, ProductType productType, Id paymentMethodId) {
}


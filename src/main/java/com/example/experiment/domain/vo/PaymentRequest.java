package com.example.experiment.domain.vo;

public record PaymentRequest(ProductCode productCode, String type, Id paymentMethod) {
}


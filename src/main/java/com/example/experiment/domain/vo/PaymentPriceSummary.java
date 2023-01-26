package com.example.experiment.domain.vo;

import java.math.BigDecimal;

public record PaymentPriceSummary(Id paymentMethodId, BigDecimal totalDiscount, BigDecimal additionalFee, BigDecimal total) {
}

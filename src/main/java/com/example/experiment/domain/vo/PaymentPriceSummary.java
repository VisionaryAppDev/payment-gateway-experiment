package com.example.experiment.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class PaymentPriceSummary {
    private Id paymentMethodId;
    private BigDecimal totalDiscount;
    private BigDecimal additionalFee;
    private BigDecimal total;
}

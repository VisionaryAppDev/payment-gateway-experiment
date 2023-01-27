package com.example.experiment.domain.entity;

import com.example.experiment.domain.specification.DiscountSpec;
import com.example.experiment.domain.specification.FeeSpec;
import com.example.experiment.domain.vo.Id;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
public class PaymentMethod {
    private Id id;
    private String name;
    private String type;
    private BigDecimal fee;
    private BigDecimal discount;
    private PaymentProvider paymentProvider;

    public PaymentMethod(Id id, String name, String type, BigDecimal fee, BigDecimal discount, PaymentProvider paymentProvider) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.fee = fee;
        this.discount = discount;
        this.paymentProvider = paymentProvider;

        DiscountSpec discountSpec = new DiscountSpec();
        discountSpec.check(this);

        FeeSpec feeSpec = new FeeSpec();
        feeSpec.check(this);
    }

    public PaymentMethod(Id id, String name, String type, BigDecimal fee, BigDecimal discount) {
        this(id, name, type, fee, discount, null);
    }
}

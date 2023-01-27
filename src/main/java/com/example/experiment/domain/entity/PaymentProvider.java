package com.example.experiment.domain.entity;

import com.example.experiment.domain.vo.Id;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class PaymentProvider {
    private Id id;
    private String name;
    private List<PaymentMethod> paymentMethods;

    public PaymentProvider(Id id, String name, List<PaymentMethod> paymentMethods) {
        this.id = id;
        this.name = name;
        this.paymentMethods = paymentMethods;
    }

}

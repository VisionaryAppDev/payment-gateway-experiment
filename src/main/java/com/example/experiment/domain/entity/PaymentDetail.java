package com.example.experiment.domain.entity;

import com.example.experiment.domain.vo.Id;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class PaymentDetail {
    private Id id;
    private List<Product> product;

    public PaymentDetail(Id id, List<Product> product) {
        this.id = id;
        this.product = product;
    }
}

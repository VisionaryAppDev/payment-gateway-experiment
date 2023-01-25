package com.example.experiment.domain.entity;

import com.example.experiment.domain.vo.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PaymentDetail {
    private Id id;
    private List<Product> product;
}

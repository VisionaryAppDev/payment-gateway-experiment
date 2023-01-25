package com.example.experiment.domain.entity;

import com.example.experiment.domain.vo.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PaymentMethod {
    private Id id;
    private String name;
    private String type;
}

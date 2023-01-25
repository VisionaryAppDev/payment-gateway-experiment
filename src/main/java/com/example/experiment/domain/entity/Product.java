package com.example.experiment.domain.entity;

import com.example.experiment.domain.vo.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class Product {
    private Id id;
    private String name;
    private String type;
    private BigDecimal price;
}

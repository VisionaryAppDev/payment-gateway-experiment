package com.example.experiment.domain.entity;

import com.example.experiment.domain.specification.PriceSpec;
import com.example.experiment.domain.vo.Id;
import com.example.experiment.domain.vo.ProductType;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
public class Product {
    private Id id;
    private String name;
    private ProductType type;
    private BigDecimal price;

    public Product(Id id, String name, ProductType type, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;

        PriceSpec priceSpec = new PriceSpec();
        priceSpec.check(this);
    }

    public void setId(Id id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;

        PriceSpec priceSpec = new PriceSpec();
        priceSpec.check(this);
    }
}

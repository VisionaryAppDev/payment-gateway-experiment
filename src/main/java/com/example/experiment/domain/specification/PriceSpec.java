package com.example.experiment.domain.specification;

import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.exception.GenericSpecificationException;
import com.example.experiment.domain.specification.shared.AbstractSpecification;

import java.math.BigDecimal;

public class PriceSpec extends AbstractSpecification<Product> {
    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getPrice().compareTo(BigDecimal.ZERO) >= 0;
    }

    @Override
    public void check(Product product) throws GenericSpecificationException {
        if (!isSatisfiedBy(product)) {
            throw new GenericSpecificationException("Price must be greater than 0");
        }
    }
}

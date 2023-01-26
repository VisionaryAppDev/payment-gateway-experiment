package com.example.experiment.domain.specification;


import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.exception.GenericSpecificationException;
import com.example.experiment.domain.specification.shared.AbstractSpecification;

import java.math.BigDecimal;

public class FeeSpec extends AbstractSpecification<PaymentMethod> {
    @Override
    public boolean isSatisfiedBy(PaymentMethod paymentMethod) {
        return paymentMethod.getDiscount().compareTo(BigDecimal.ZERO) >= 0 && paymentMethod.getDiscount().compareTo(new BigDecimal(100)) <= 0;
    }

    @Override
    public void check(PaymentMethod paymentMethod) throws GenericSpecificationException {
        if (!isSatisfiedBy(paymentMethod))
            throw new GenericSpecificationException("Fee percentage must be between 0 and 100");
    }
}

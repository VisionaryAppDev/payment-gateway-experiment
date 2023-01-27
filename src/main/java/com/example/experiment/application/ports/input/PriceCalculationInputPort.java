package com.example.experiment.application.ports.input;

import com.example.experiment.application.usecases.PriceCalculationUseCase;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.vo.PaymentPriceSummary;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculationInputPort implements PriceCalculationUseCase {
    @Override
    public List<PaymentPriceSummary> calculate(PaymentDetail paymentDetail, List<PaymentMethod> paymentMethods) {
        return paymentMethods.stream().map(paymentMethod -> calculate(paymentDetail, paymentMethod)).toList();
    }

    @Override
    public PaymentPriceSummary calculate(PaymentDetail paymentDetail, PaymentMethod paymentMethod) {
        BigDecimal subtotal = paymentDetail.getProduct().stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        var discount = subtotal.subtract(subtotal.multiply(paymentMethod.getDiscount()).divide(new BigDecimal(100)));
        var fee = subtotal.add(subtotal.multiply(paymentMethod.getFee()).divide(new BigDecimal(100)));
        var total = subtotal.subtract(discount).add(fee);

        return new PaymentPriceSummary(paymentMethod.getId(), discount, fee, total);
    }
}

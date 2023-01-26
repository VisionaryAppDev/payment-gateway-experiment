package com.example.experiment.application.ports.input;

import com.example.experiment.application.ports.output.PaymentOutputPort;
import com.example.experiment.application.usecases.PaymentUseCase;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.PaymentInquiryResponse;
import com.example.experiment.domain.vo.PaymentPriceSummary;
import com.example.experiment.domain.vo.PaymentRequest;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@RequiredArgsConstructor
public class PaymentInputPort implements PaymentUseCase {

    private final PaymentOutputPort paymentOutputPort;

    @Override
    public PaymentInquiryResponse inquiry(PaymentInquiryRequest paymentInquiryRequest) {
        PaymentDetail paymentDetail = paymentOutputPort.retrievePaymentDetail(paymentInquiryRequest);
        List<PaymentMethod> paymentMethods = paymentOutputPort.retrieveAvailablePaymentMethod(paymentInquiryRequest.productCode());

        /// Price Summary
        BigDecimal subtotal = paymentDetail.getProduct().stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        List<PaymentPriceSummary> paymentPriceSummaries = paymentMethods.stream().map(paymentMethod -> {
            var discount = subtotal.subtract(subtotal.multiply(paymentMethod.getDiscount()).divide(new BigDecimal(100)));
            var fee = subtotal.add(subtotal.multiply(paymentMethod.getFee()).divide(new BigDecimal(100), RoundingMode.CEILING));
            var total = subtotal.subtract(discount).add(fee);

            return new PaymentPriceSummary(paymentMethod.getId(), discount, fee, total);
        }).toList();

        return new PaymentInquiryResponse(paymentDetail, paymentMethods, paymentPriceSummaries);
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        /// inquiry(...)
    }
}

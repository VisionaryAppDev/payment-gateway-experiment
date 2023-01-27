package com.example.experiment.application.ports.input;

import com.example.experiment.application.ports.output.PaymentSettlementOutputPort;
import com.example.experiment.application.usecases.InquiryProductDetailUseCase;
import com.example.experiment.application.usecases.InquiryPaymentMethodUseCase;
import com.example.experiment.application.usecases.PaymentSettlementUseCase;
import com.example.experiment.application.usecases.PriceCalculationUseCase;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.ProductDetailInquiryRequest;
import com.example.experiment.domain.vo.PaymentPriceSummary;
import com.example.experiment.domain.vo.PaymentSettlementRequest;
import com.example.experiment.domain.vo.SettlementResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentSettlementInputPort implements PaymentSettlementUseCase {
    private final InquiryProductDetailUseCase inquiryProductDetailUseCase;
    private final InquiryPaymentMethodUseCase inquiryPaymentMethodUseCase;
    private final PriceCalculationUseCase priceCalculationUseCase;
    private final PaymentSettlementOutputPort paymentSettlementOutputPort;

    @Override
    public SettlementResponse settle(PaymentSettlementRequest paymentSettlementRequest) {
        ProductDetailInquiryRequest productDetailInquiryRequest = new ProductDetailInquiryRequest(paymentSettlementRequest.productCode(), paymentSettlementRequest.productType());
        PaymentDetail paymentDetail = inquiryProductDetailUseCase.inquiry(productDetailInquiryRequest);
        PaymentMethod paymentMethod = inquiryPaymentMethodUseCase.findById(paymentSettlementRequest.paymentMethodId());
        PaymentPriceSummary priceSummary = priceCalculationUseCase.calculate(paymentDetail, paymentMethod);

        return paymentSettlementOutputPort.settle(paymentDetail, paymentMethod, priceSummary);
    }
}

package com.example.experiment.framework.adapters.general.input.rest;


import com.example.experiment.application.usecases.InquiryPaymentMethodUseCase;
import com.example.experiment.application.usecases.PaymentSettlementUseCase;
import com.example.experiment.application.usecases.PriceCalculationUseCase;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.*;
import com.example.experiment.framework.adapters.general.factory.InquiryPaymentInfoFactory;
import com.example.experiment.framework.adapters.general.factory.PaymentSettlementFactory;
import com.example.experiment.framework.adapters.general.output.dto.response.PaymentInquiryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class PaymentAdapter {

    private final PriceCalculationUseCase priceCalculationUseCase;
    private final InquiryPaymentMethodUseCase inquiryPaymentMethodUseCase;
    private final InquiryPaymentInfoFactory inquiryPaymentInfoFactory;
    private final PaymentSettlementFactory paymentSettlementFactory;
    private PaymentSettlementUseCase paymentSettlementUseCase;

    @GetMapping("/inquiry")
    public PaymentInquiryResponse getPaymentUseCase(@RequestParam ProductType type) {
        /// Test Data
        ProductCode productCode = new ProductCode("CODE-001");

        ///
        PaymentDetail paymentDetail = inquiryPaymentInfoFactory.getPayment(type).inquiry(new ProductDetailInquiryRequest(productCode, type));
        List<PaymentMethod> paymentMethods = inquiryPaymentMethodUseCase.findAll();
        List<PaymentPriceSummary> priceSummary = priceCalculationUseCase.calculate(paymentDetail, paymentMethods);

        return new PaymentInquiryResponse(paymentDetail, paymentMethods, priceSummary);
    }

    @PostMapping("/settle")
    public SettlementResponse settle(@RequestBody PaymentSettlementRequest paymentSettlementRequest) {
        return paymentSettlementFactory.getPaymentProviderByPaymentMethodId(paymentSettlementRequest.paymentMethodId()).settle(paymentSettlementRequest);
    }
}

package com.example.experiment.framework.adapters.general.input.rest;


import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.PaymentInquiryResponse;
import com.example.experiment.domain.vo.ProductCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class PaymentAdapter {

    @GetMapping("/test")
    public PaymentInquiryResponse getPaymentUseCase() {
        ProductCode productCode = new ProductCode("CODE-001");
        String type = "FLIGHT";

        return PaymentUseCaseBean.paymentUseCases.get(type).inquiry(new PaymentInquiryRequest(productCode, type));
    }
}

package com.example.experiment.application.ports.input;

import com.example.experiment.application.ports.output.InquiryProductDetailOutputPort;
import com.example.experiment.application.usecases.InquiryProductDetailUseCase;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.vo.ProductDetailInquiryRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InquiryProductDetailInputPort implements InquiryProductDetailUseCase {

    private final InquiryProductDetailOutputPort inquiryProductDetailOutputPort;

    @Override
    public PaymentDetail inquiry(ProductDetailInquiryRequest productDetailInquiryRequest) {
        return inquiryProductDetailOutputPort.inquiry(productDetailInquiryRequest);
    }
}

package com.example.experiment.application.usecases;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.vo.ProductDetailInquiryRequest;

public interface InquiryProductDetailUseCase {
    PaymentDetail inquiry(ProductDetailInquiryRequest productDetailInquiryRequest);
}

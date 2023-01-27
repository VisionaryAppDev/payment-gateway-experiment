package com.example.experiment.application.ports.output;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.vo.ProductDetailInquiryRequest;
import com.example.experiment.domain.vo.ProductType;

public interface InquiryProductDetailOutputPort {
    PaymentDetail inquiry(ProductDetailInquiryRequest productDetailInquiryRequest);

    ProductType getType();
}

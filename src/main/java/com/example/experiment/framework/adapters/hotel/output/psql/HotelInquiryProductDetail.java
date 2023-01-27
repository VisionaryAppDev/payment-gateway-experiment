package com.example.experiment.framework.adapters.hotel.output.psql;

import com.example.experiment.application.ports.output.InquiryProductDetailOutputPort;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.vo.Id;
import com.example.experiment.domain.vo.ProductDetailInquiryRequest;
import com.example.experiment.domain.vo.ProductType;
import com.example.experiment.framework.adapters.hotel.output.dto.response.HotelPaymentDetailResponseDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service("hotelPaymentAdapter")
public class HotelInquiryProductDetail implements InquiryProductDetailOutputPort {

    @Override
    public PaymentDetail inquiry(ProductDetailInquiryRequest productDetailInquiryRequest) {
        /// Retrieve data from "Product Service"
        List<Product> products = List.of(
                new Product(new Id(1L), "Hotel 001", ProductType.HOTEL, new BigDecimal(50)),
                new Product(new Id(2L), "Hotel 002", ProductType.HOTEL, new BigDecimal(70)),
                new Product(new Id(3L), "Hotel 003", ProductType.HOTEL, new BigDecimal(80)));

        return new HotelPaymentDetailResponseDto(new Id(1L), products, "Additional: " +UUID.randomUUID());
    }

    @Override
    public ProductType getType() {
        return ProductType.HOTEL;
    }
}

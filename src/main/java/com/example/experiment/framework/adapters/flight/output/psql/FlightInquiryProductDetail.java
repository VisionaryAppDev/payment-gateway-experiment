package com.example.experiment.framework.adapters.flight.output.psql;

import com.example.experiment.application.ports.output.InquiryProductDetailOutputPort;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.vo.Id;
import com.example.experiment.domain.vo.ProductDetailInquiryRequest;
import com.example.experiment.domain.vo.ProductType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FlightInquiryProductDetail implements InquiryProductDetailOutputPort {

    @Override
    public PaymentDetail inquiry(ProductDetailInquiryRequest productDetailInquiryRequest) {
        /// HTTP Request: retrieve data from "Product Service"
        List<Product> products = List.of(
                new Product(new Id(1L), "Flight 001", ProductType.FLIGHT, new BigDecimal(399)),
                new Product(new Id(2L), "Flight 002", ProductType.FLIGHT, new BigDecimal(450)),
                new Product(new Id(3L), "Flight 003", ProductType.FLIGHT, new BigDecimal(740))
        );

        return new PaymentDetail(new Id(1L), products);
    }

    @Override
    public ProductType getType() {
        return ProductType.FLIGHT;
    }
}

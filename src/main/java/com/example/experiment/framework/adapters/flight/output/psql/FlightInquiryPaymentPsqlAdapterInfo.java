package com.example.experiment.framework.adapters.flight.output.psql;

import com.example.experiment.application.ports.output.InquiryPaymentInfoOutputPort;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.vo.Id;
import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.ProductType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("flightPaymentAdapter")
public class FlightInquiryPaymentPsqlAdapterInfo implements InquiryPaymentInfoOutputPort {

    @Override
    public PaymentDetail inquiry(PaymentInquiryRequest paymentInquiryRequest) {
        /// Retrieve data from "Product Service"
        List<Product> products = List.of(
                new Product(new Id(1L), "Flight 001", ProductType.FLIGHT, new BigDecimal(50)),
                new Product(new Id(2L), "Flight 002", ProductType.FLIGHT, new BigDecimal(70)),
                new Product(new Id(3L), "Flight 003", ProductType.FLIGHT, new BigDecimal(80))
        );

        return new PaymentDetail(new Id(1L), products);
    }

    @Override
    public ProductType getType() {
        return ProductType.FLIGHT;
    }
}

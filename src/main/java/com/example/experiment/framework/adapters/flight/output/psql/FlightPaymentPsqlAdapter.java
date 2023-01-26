package com.example.experiment.framework.adapters.flight.output.psql;

import com.example.experiment.application.ports.output.PaymentOutputPort;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.vo.Id;
import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.ProductCode;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("flightPaymentAdapter")
public class FlightPaymentPsqlAdapter implements PaymentOutputPort {

    @Override
    public PaymentDetail retrievePaymentDetail(PaymentInquiryRequest paymentInquiryRequest) {
        /// Retrieve data from "Product Service"
        List<Product> products = List.of(
                new Product(new Id(1L), "Flight 001", "FLIGHT", new BigDecimal(50)),
                new Product(new Id(2L), "Flight 002", "FLIGHT", new BigDecimal(70)),
                new Product(new Id(3L), "Flight 003", "FLIGHT", new BigDecimal(80))
        );

        return new PaymentDetail(new Id(1L), products);
    }

    @Override
    public List<PaymentMethod> retrieveAvailablePaymentMethod(ProductCode productCode) {
        /// Query Data from DB
        return List.of(
                new PaymentMethod(new Id(1L), "Mastercard", "CARD", BigDecimal.ZERO, new BigDecimal(2)),
                new PaymentMethod(new Id(2L), "VISA Card", "CARD", BigDecimal.ZERO, new BigDecimal(2)),
                new PaymentMethod(new Id(3L), "Pi Pay", "CARD", BigDecimal.ZERO, new BigDecimal(2)),
                new PaymentMethod(new Id(4L), "ABA", "BANK", BigDecimal.ZERO, BigDecimal.ZERO),
                new PaymentMethod(new Id(4L), "Phillip Bank", "BANK", BigDecimal.ZERO, BigDecimal.ZERO)
        );
    }

    @Override
    public String getType() {
        return "FLIGHT";
    }
}

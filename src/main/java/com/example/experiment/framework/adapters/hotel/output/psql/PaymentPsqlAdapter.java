package com.example.experiment.framework.adapters.hotel.output.psql;

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

@Service
public class PaymentPsqlAdapter implements PaymentOutputPort {

    @Override
    public PaymentDetail retrievePaymentDetail(PaymentInquiryRequest paymentInquiryRequest) {
        /// Retrieve data from "Product Service"
        List<Product> products = List.of(new Product(new Id(1L), "Hotel 001", "HOTEL", new BigDecimal(50)), new Product(new Id(2L), "Hotel 002", "HOTEL", new BigDecimal(70)), new Product(new Id(3L), "Hotel 003", "HOTEL", new BigDecimal(80)));

        return new PaymentDetail(new Id(1L), products);
    }

    @Override
    public List<PaymentMethod> retrieveAvailablePaymentMethod(ProductCode productCode) {
        /// Query Data from DB
        List<PaymentMethod> paymentMethods = List.of(new PaymentMethod(new Id(1L), "Mastercard", "CARD"), new PaymentMethod(new Id(2L), "VISA Card", "CARD"), new PaymentMethod(new Id(3L), "Pi Pay", "CARD"), new PaymentMethod(new Id(4L), "ABA", "BANK"), new PaymentMethod(new Id(4L), "Phillip Bank", "BANK"));

        return paymentMethods;
    }

//    @Override
//    public String getType() {
//        return "HOTEL";
//    }
}
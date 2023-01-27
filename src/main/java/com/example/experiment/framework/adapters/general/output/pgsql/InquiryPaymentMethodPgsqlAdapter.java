package com.example.experiment.framework.adapters.general.output.pgsql;


import com.example.experiment.application.ports.output.InquiryPaymentMethodOutputPort;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.entity.PaymentProvider;
import com.example.experiment.domain.vo.Id;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class InquiryPaymentMethodPgsqlAdapter implements InquiryPaymentMethodOutputPort {
    @Override
    public PaymentMethod findById(Id id) {
        /// Query from DB
        return findAll().stream().filter(paymentMethod -> paymentMethod.getId().equals(id)).findAny().orElseThrow(() -> new RuntimeException("No data found: " + id));
    }

    @Override
    public List<PaymentMethod> findAll() {
        /// Query from DB
        PaymentProvider aba = new PaymentProvider(new Id(1L), "ABA", null);
        PaymentProvider phillipBank = new PaymentProvider(new Id(1L), "PHILLIP", null);
        PaymentProvider stripe = new PaymentProvider(new Id(1L), "STRIPE", null);

        return List.of(
            new PaymentMethod(new Id(1L), "Mastercard", "CARD", BigDecimal.ZERO, new BigDecimal(2), stripe),
            new PaymentMethod(new Id(2L), "VISA Card", "CARD", BigDecimal.ZERO, new BigDecimal(2), stripe),
            new PaymentMethod(new Id(3L), "Pi Pay", "CARD", BigDecimal.ZERO, new BigDecimal(2), stripe),
            new PaymentMethod(new Id(4L), "Phillip Scan QR", "KHQR", BigDecimal.ZERO, BigDecimal.ZERO, phillipBank),
            new PaymentMethod(new Id(5L), "ABA Pay", "KHQR", BigDecimal.ZERO, BigDecimal.ZERO, aba)
        );
    }
}

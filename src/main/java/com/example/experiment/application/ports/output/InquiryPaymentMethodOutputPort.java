package com.example.experiment.application.ports.output;

import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.Id;

import java.util.List;

public interface InquiryPaymentMethodOutputPort {
    PaymentMethod findById(Id id);
    List<PaymentMethod> findAll();
}

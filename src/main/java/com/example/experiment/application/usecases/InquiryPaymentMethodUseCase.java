package com.example.experiment.application.usecases;

import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.Id;

import java.util.List;

public interface InquiryPaymentMethodUseCase {
    PaymentMethod findById(Id id);

    List<PaymentMethod> findAll();
}

package com.example.experiment.application.ports.input;

import com.example.experiment.application.ports.output.InquiryPaymentMethodOutputPort;
import com.example.experiment.application.usecases.InquiryPaymentMethodUseCase;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.Id;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class InquiryPaymentMethodInputPort implements InquiryPaymentMethodUseCase {
    private final InquiryPaymentMethodOutputPort inquiryPaymentMethodOutputPort;

    @Override
    public PaymentMethod findById(Id id) {
        return inquiryPaymentMethodOutputPort.findById(id);
    }

    @Override
    public List<PaymentMethod> findAll() {
        return inquiryPaymentMethodOutputPort.findAll();
    }
}

package com.example.experiment.application.ports.input;

import com.example.experiment.application.ports.output.InquiryPaymentInfoOutputPort;
import com.example.experiment.application.usecases.InquiryPaymentInfoUseCase;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.vo.PaymentInquiryRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InquiryPaymentInfoInputPort implements InquiryPaymentInfoUseCase {

    private final InquiryPaymentInfoOutputPort inquiryPaymentInfoOutputPort;

    @Override
    public PaymentDetail inquiry(PaymentInquiryRequest paymentInquiryRequest) {
        return inquiryPaymentInfoOutputPort.inquiry(paymentInquiryRequest);
    }
}

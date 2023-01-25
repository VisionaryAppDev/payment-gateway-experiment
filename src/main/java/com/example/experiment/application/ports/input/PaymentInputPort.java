package com.example.experiment.application.ports.input;

import com.example.experiment.application.ports.output.PaymentOutputPort;
import com.example.experiment.application.usecases.PaymentUseCase;
import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import com.example.experiment.domain.vo.PaymentInquiryRequest;
import com.example.experiment.domain.vo.PaymentInquiryResponse;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
public class PaymentInputPort implements PaymentUseCase {

    private final PaymentOutputPort paymentOutputPort;

    @Override
    public PaymentInquiryResponse inquiry(PaymentInquiryRequest paymentInquiryRequest) {
        PaymentDetail paymentDetail = paymentOutputPort.retrievePaymentDetail(paymentInquiryRequest);
        List<PaymentMethod> paymentMethod = paymentOutputPort.retrieveAvailablePaymentMethod(paymentInquiryRequest.productCode());

        return new PaymentInquiryResponse(paymentDetail, paymentMethod);
    }
}

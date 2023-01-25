package com.example.experiment.domain.vo;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class PaymentInquiryResponse {
    private PaymentDetail paymentDetail;
    private List<PaymentMethod> paymentMethod;
}

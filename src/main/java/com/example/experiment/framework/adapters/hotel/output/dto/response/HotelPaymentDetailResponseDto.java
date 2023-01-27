package com.example.experiment.framework.adapters.hotel.output.dto.response;

import com.example.experiment.domain.entity.PaymentDetail;
import com.example.experiment.domain.entity.Product;
import com.example.experiment.domain.vo.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;


@EqualsAndHashCode
@ToString
@Getter
public class HotelPaymentDetailResponseDto extends PaymentDetail {
    private String additionalField;

    public HotelPaymentDetailResponseDto(Id id, List<Product> product, String additionalField) {
        super(id, product);
        this.additionalField = additionalField;
    }
}

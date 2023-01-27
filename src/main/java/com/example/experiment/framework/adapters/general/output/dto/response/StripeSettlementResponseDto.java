package com.example.experiment.framework.adapters.general.output.dto.response;

import com.example.experiment.domain.vo.SettlementResponse;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class StripeSettlementResponseDto extends SettlementResponse {

    private String additionalField;

    public StripeSettlementResponseDto(String txnId, LocalDateTime createdAt, String additionalField) {
        super(txnId, createdAt);
        this.additionalField = additionalField;
    }
}

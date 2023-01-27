package com.example.experiment.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Setter
@Getter
public class SettlementResponse {
    private String txnId;
    private LocalDateTime createdAt;
}

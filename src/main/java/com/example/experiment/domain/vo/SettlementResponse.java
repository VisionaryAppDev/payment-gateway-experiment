package com.example.experiment.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class SettlementResponse {
    private String txnId;
    private LocalDateTime createdAt;
}

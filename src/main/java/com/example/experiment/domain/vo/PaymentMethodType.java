package com.example.experiment.domain.vo;

public enum PaymentMethodType {
    CARD("CARD"),
    E_WALLET("E WALLET"),
    MOBILE_APP("MOBILE APP");

    private final String type;

    PaymentMethodType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

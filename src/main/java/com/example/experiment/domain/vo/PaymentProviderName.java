package com.example.experiment.domain.vo;

public enum PaymentProviderName {
    PHILLIP("PHILLIP"),
    ABA("ABA"),
    STRIPE("STRIPE");

    private final String name;

    PaymentProviderName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

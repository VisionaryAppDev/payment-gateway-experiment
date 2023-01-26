package com.example.experiment.domain.vo;

public enum ProductType {
    FLIGHT("FLIGHT"),
    HOTEL("HOTEL"),
    TOUR("TOUR");

    private final String type;

    ProductType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

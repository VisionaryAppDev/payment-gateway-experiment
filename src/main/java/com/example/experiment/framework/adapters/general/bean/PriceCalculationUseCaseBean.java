package com.example.experiment.framework.adapters.general.bean;

import com.example.experiment.application.ports.input.PriceCalculationInputPort;
import com.example.experiment.application.usecases.PriceCalculationUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PriceCalculationUseCaseBean {
    @Bean
    public PriceCalculationUseCase priceCalculationUseCase() {
        return new PriceCalculationInputPort();
    }
}

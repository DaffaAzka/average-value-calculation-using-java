package com.dest.calculation.view;

import com.dest.calculation.entity.NumberData;
import com.dest.calculation.service.CalculationService;
import com.dest.calculation.utils.inputUtils;

public class CalculationView {

    public CalculationView(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    CalculationService calculationService;

    public void mainView() {

        while (true) {

            try {
                Number value = inputUtils.inputNum("Enter your value");
                calculationService.addValue(value);
            } catch (Exception e) {
                break;
            }

        }

        calculateView();

    }

    public void calculateView() {
        calculationService.calculate();
    }

}

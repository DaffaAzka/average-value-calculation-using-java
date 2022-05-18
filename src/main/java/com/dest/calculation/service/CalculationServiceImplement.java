package com.dest.calculation.service;

import com.dest.calculation.entity.NumberData;
import com.dest.calculation.repository.CalculationRepository;

import java.text.DecimalFormat;

public class CalculationServiceImplement implements CalculationService{

    public CalculationServiceImplement(CalculationRepository calculationRepository) {
        this.calculationRepository = calculationRepository;
    }

    CalculationRepository calculationRepository;
    
    @Override
    public void addValue(Number number) {
        boolean result = calculationRepository.addValue(new NumberData(number));
        
        if (result) {
            System.out.println("Success to add value " + "(" + number + ")" + "!");
        } else {
            System.out.println("Failed to add value!");
        }
    }

    @Override
    public void calculate() {
        System.out.println("==========================================");
        System.out.println("Data : [ " + calculationRepository.showData() + " ]");
        System.out.print("Result : ");
        System.out.printf("%.2f", calculationRepository.calculate());
    }
}

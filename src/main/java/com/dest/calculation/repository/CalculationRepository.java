package com.dest.calculation.repository;

import com.dest.calculation.entity.NumberData;

public interface CalculationRepository {

    public String showData();

    public boolean addValue(NumberData number);

    public double calculate();

}

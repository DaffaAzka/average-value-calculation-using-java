package com.dest.calculation.repository;

import com.dest.calculation.entity.NumberData;

import java.util.Arrays;

public class CalculationRepositoryImplement implements CalculationRepository {

    NumberData<Double>[] data = new NumberData[10];

    void isFull() {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                break;
            } else if (data.length == (i + 1)) {

                var temp = data;
                data = new NumberData[temp.length * 2];
                System.arraycopy(temp, 0, data, 0, temp.length);

            }
        }

    }

    @Override
    public String showData() {

        StringBuilder temp = new StringBuilder(" ");

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                temp.append(data[i].num()).append(", ");
            }
        }

        return temp.toString();

    }

    @Override
    public boolean addValue(NumberData number) {

        isFull();

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = number;
                return true;
            }
        }

        return false;
    }

    @Override
    public double calculate() {
        double raw = 0;

        for (NumberData<Double> datum : data) {

            if (datum != null) {
                raw += datum.num();
            }

        }

        double result = raw / data.length ;

        return result;
    }
}

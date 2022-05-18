package com.dest.calculation;

import com.dest.calculation.repository.CalculationRepositoryImplement;
import com.dest.calculation.service.CalculationServiceImplement;
import com.dest.calculation.view.CalculationView;

public class App {

    public static void main(String[] args) {

        CalculationRepositoryImplement calculationRepositoryImplement = new CalculationRepositoryImplement();
        CalculationServiceImplement calculationServiceImplement = new CalculationServiceImplement(calculationRepositoryImplement);
        CalculationView calculationView = new CalculationView(calculationServiceImplement);

        calculationView.mainView();

    }

}

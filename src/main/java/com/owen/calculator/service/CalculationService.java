package com.owen.calculator.service;

import com.owen.calculator.dao.CalculationDao;
import com.owen.calculator.model.Calculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationService {

    @Autowired
    CalculationDao calculationDao;

    public Calculation calculate(double a, double b, String operation) {
        Calculation calculation = new Calculation();
        calculation.setFirstNumber(a);
        calculation.setSecondNumber(b);
        calculation.setOperation(operation);

        double result;
        switch (operation) {
            case "ADD": result = a + b; break;
            case "SUBTRACT": result = a - b; break;
            case "MULTIPLY": result = a * b; break;
            case "DIVIDE": result = a / b; break;
            default: throw new IllegalArgumentException("Unknown operation: " + operation);
        }

        calculation.setResult(result);
        return calculationDao.save(calculation);
    }

    public List<Calculation> getAllCalculations() {
        return calculationDao.findAll();
    }
}
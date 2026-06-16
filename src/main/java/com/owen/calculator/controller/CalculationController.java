package com.owen.calculator.controller;

import com.owen.calculator.model.Calculation;
import com.owen.calculator.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class CalculationController {

    @Autowired
    CalculationService calculationService;

    @GetMapping ("/calculate")
    public Calculation calculate(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam String operation) {
        return calculationService.calculate(a, b, operation);
    }

    @GetMapping("/history")
    public List<Calculation> getAllCalculations() {
        return calculationService.getAllCalculations();
    }
}
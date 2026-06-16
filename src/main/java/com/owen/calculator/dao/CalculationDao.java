package com.owen.calculator.dao;

import com.owen.calculator.model.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationDao extends JpaRepository<Calculation, Integer> {
}
package com.owen.calculator.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String applicantName;
    private Long loanAmount;
    private Double interestRate;
    private Integer durationMonths;
    private Boolean isApproved;
}
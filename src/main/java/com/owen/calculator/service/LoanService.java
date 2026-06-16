package com.owen.calculator.service;

import com.owen.calculator.dao.LoanDao;
import com.owen.calculator.exception.LoanNotFoundException;
import com.owen.calculator.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    LoanDao loanDao;

    public Loan applyForLoan(Loan loan) {
        loan.setIsApproved(false);
        return loanDao.save(loan);
    }

    public List<Loan> getAllLoans() {
        return loanDao.findAll();
    }

    public Loan approveLoan(Long id) {
        Loan loan = loanDao.findById(id)
                .orElseThrow(() -> new LoanNotFoundException(id));
        loan.setIsApproved(true);
        return loanDao.save(loan);
    }
    public void deleteLoan(Long id) {
        loanDao.deleteById(id);
    }
}
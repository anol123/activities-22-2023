package com.training.project.LoanApplication.Services;

import java.util.List;

import com.training.project.LoanApplication.Entity.Loan;
import com.training.project.LoanApplication.Excepton.BusinessException;

public interface LoanService {
    List<Loan> getAllLoans();
    Loan applyForLoan(Long customerId, int loanType) throws BusinessException;
 
}


package com.training.project.LoanApplication.Services;

import java.util.List;

import com.training.project.LoanApplication.Entity.CreditScore;
import com.training.project.LoanApplication.Entity.LoanApplication;
import com.training.project.LoanApplication.Entity.LoanOfficer;
import com.training.project.LoanApplication.Excepton.BusinessException;

public interface LoanOfficerService {
    LoanApplication loginLoanOfficer(String employeeId, String password) throws BusinessException;
    List<LoanApplication> viewLoanApplications();
    void updateLoanApplicationStatus(Long loanApplicationId, String status) throws BusinessException;
    List<CreditScore> viewCreditScores(String customerPan) throws BusinessException;
}


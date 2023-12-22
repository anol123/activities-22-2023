package com.training.project.LoanApplication.Services;

import java.util.List;

import com.training.project.LoanApplication.Entity.LoanApplication;
import com.training.project.LoanApplication.Excepton.BusinessException;

public interface LoanApplicationService {
    List<LoanApplication> getAllLoanApplications();
    void updateLoanApplicationStatus(Long loanApplicationId, String status) throws BusinessException;
}


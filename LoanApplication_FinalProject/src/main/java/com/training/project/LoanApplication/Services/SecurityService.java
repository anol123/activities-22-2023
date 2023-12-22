package com.training.project.LoanApplication.Services;

public interface SecurityService {
    void logLoginAttempt(String email, boolean success);
    void logAudit(String details);
    
}


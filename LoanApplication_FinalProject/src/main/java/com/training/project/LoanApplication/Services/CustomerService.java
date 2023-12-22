package com.training.project.LoanApplication.Services;

import com.training.project.LoanApplication.Entity.Customer;
import com.training.project.LoanApplication.Excepton.BusinessException;

public interface CustomerService {
    Customer save(Customer customer) throws BusinessException;

	Customer registerCustomer(Customer registrationDto);

	Customer loginCustomer(String email, String password);
   
  
}


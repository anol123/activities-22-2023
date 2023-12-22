package com.training.project.LoanApplication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.project.LoanApplication.Dao.CustomerRepository;
import com.training.project.LoanApplication.Dao.LoanRepository;
import com.training.project.LoanApplication.Entity.Customer;
import com.training.project.LoanApplication.Entity.Loan;
import com.training.project.LoanApplication.Excepton.BusinessException;
import com.training.project.LoanApplication.Services.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    @Override
    public Loan applyForLoan(Long customerId, int loanType) throws BusinessException {
        try {
            Customer customer = customerRepository.findById(customerId)
                    .orElseThrow(() -> new BusinessException("Customer not found with ID: " + customerId));

            Loan newLoan = new Loan();
            newLoan.setLoanType(loanType);
            newLoan.setCustomer(customer);

            
            return loanRepository.save(newLoan);

        } catch (Exception e) {
            throw new BusinessException("Error occurred while applying for a loan", e);
        }
    }

}


package com.training.project.LoanApplication.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.LoanApplication.Entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}


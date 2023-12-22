package com.training.project.LoanApplication.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.LoanApplication.Entity.LoanApplication;
import com.training.project.LoanApplication.Entity.LoanOfficer;

@Repository
public interface LoanOfficerRepository extends JpaRepository<LoanOfficer, Long> {
    Optional<LoanOfficer> findByEmployeeId(String employeeId);


	Optional<LoanApplication> findByEmployeeIdAndPassword(String employeeId, String password);
    
}


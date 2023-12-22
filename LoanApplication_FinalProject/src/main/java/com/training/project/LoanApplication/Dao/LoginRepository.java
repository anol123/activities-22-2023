package com.training.project.LoanApplication.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.project.LoanApplication.Entity.Login;
import com.training.project.LoanApplication.Entity.LoginLog;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	void save(LoginLog loginLog);
}


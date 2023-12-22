package com.training.project.LoanApplication.Services;

import org.springframework.web.multipart.MultipartFile;

import com.training.project.LoanApplication.Excepton.BusinessException;

public interface DocumentService {
    void uploadDocument(Long customerId, MultipartFile document) throws BusinessException;
}


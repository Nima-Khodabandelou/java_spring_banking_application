package com.nkh1987.banking.service;

import com.nkh1987.banking.dto.TransactionDto;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    void saveTransaction(TransactionDto transaction);
}

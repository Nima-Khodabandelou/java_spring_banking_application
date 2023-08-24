package com.nkh1987.banking.service;

import com.nkh1987.banking.dto.TransactionDto;
import com.nkh1987.banking.entity.Transaction;
import com.nkh1987.banking.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionServices implements TransactionService {


    private final TransactionRepository transactionRepository;

    public TransactionServices(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCEED")
                .build();

        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }
}

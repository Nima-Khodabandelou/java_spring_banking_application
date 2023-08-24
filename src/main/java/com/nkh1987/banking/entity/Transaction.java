package com.nkh1987.banking.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;
    private String transactionType;
    private String accountNumber;
    private BigDecimal amount;
    // status: failed, succeed, ...
    private String status;

    public Transaction(String transactionId, String transactionType, String accountNumber, BigDecimal amount, String status) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.status = status;
    }

    public Transaction() {
    }


    public static TransactionBuilder builder() {
        return new TransactionBuilder();
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class TransactionBuilder {
        private String transactionId;
        private String transactionType;
        private String accountNumber;
        private BigDecimal amount;
        private String status;

        TransactionBuilder() {
        }

        public TransactionBuilder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public TransactionBuilder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public TransactionBuilder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public TransactionBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public TransactionBuilder status(String status) {
            this.status = status;
            return this;
        }

        public Transaction build() {
            return new Transaction(transactionId, transactionType, accountNumber, amount, status);
        }

        public String toString() {
            return "Transaction.TransactionBuilder(transactionId=" + this.transactionId + ", transactionType=" + this.transactionType + ", accountNumber=" + this.accountNumber + ", amount=" + this.amount + ", status=" + this.status + ")";
        }
    }
}

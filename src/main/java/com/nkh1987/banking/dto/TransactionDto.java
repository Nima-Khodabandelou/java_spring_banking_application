package com.nkh1987.banking.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class TransactionDto {

    private String transactionType;
    private String accountNumber;
    private BigDecimal amount;
    private String status;

    public TransactionDto(String transactionType, String accountNumber, BigDecimal amount, String status) {
        this.transactionType = transactionType;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.status = status;
    }

    public TransactionDto() {
    }

    public static TransactionDtoBuilder builder() {
        return new TransactionDtoBuilder();
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransactionDto)) return false;
        final TransactionDto other = (TransactionDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$transactionType = this.getTransactionType();
        final Object other$transactionType = other.getTransactionType();
        if (!Objects.equals(this$transactionType, other$transactionType))
            return false;
        final Object this$accountNumber = this.getAccountNumber();
        final Object other$accountNumber = other.getAccountNumber();
        if (!Objects.equals(this$accountNumber, other$accountNumber))
            return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (!Objects.equals(this$amount, other$amount)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (
                !Objects.equals(this$status, other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransactionDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $transactionType = this.getTransactionType();
        result = result * PRIME + ($transactionType == null ? 43 : $transactionType.hashCode());
        final Object $accountNumber = this.getAccountNumber();
        result = result * PRIME + ($accountNumber == null ? 43 : $accountNumber.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "TransactionDto(transactionType=" + this.getTransactionType() + ", accountNumber=" + this.getAccountNumber() + ", amount=" + this.getAmount() + ", status=" + this.getStatus() + ")";
    }

    public static class TransactionDtoBuilder {
        private String transactionType;
        private String accountNumber;
        private BigDecimal amount;
        private String status;

        TransactionDtoBuilder() {
        }

        public TransactionDtoBuilder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public TransactionDtoBuilder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public TransactionDtoBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public TransactionDtoBuilder status(String status) {
            this.status = status;
            return this;
        }

        public TransactionDto build() {
            return new TransactionDto(transactionType, accountNumber, amount, status);
        }

        public String toString() {
            return "TransactionDto.TransactionDtoBuilder(transactionType=" + this.transactionType + ", accountNumber=" + this.accountNumber + ", amount=" + this.amount + ", status=" + this.status + ")";
        }
    }
}

package com.nkh1987.banking.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class DepositWithdrawRequest {

    private String accountNumber;
    private BigDecimal amount;

    public DepositWithdrawRequest(String accountNumber, BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public DepositWithdrawRequest() {
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DepositWithdrawRequest)) return false;
        final DepositWithdrawRequest other = (DepositWithdrawRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$accountNumber = this.getAccountNumber();
        final Object other$accountNumber = other.getAccountNumber();
        if (!Objects.equals(this$accountNumber, other$accountNumber))
            return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (!Objects.equals(this$amount, other$amount)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DepositWithdrawRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $accountNumber = this.getAccountNumber();
        result = result * PRIME + ($accountNumber == null ? 43 : $accountNumber.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        return result;
    }

    public String toString() {
        return "DepositWithdrawRequest(accountNumber=" + this.getAccountNumber() + ", amount=" + this.getAmount() + ")";
    }
}

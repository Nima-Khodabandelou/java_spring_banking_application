package com.nkh1987.banking.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class AccountInfo {

    private String accountOwnerName;

    private BigDecimal accountBalance;

    private String accountNumber;

    public AccountInfo(String accountOwnerName, BigDecimal accountBalance, String accountNumber) {
        this.accountOwnerName = accountOwnerName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public AccountInfo() {
    }

    public static AccountInfoBuilder builder() {
        return new AccountInfoBuilder();
    }

    public String getAccountOwnerName() {
        return this.accountOwnerName;
    }

    public BigDecimal getAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AccountInfo)) return false;
        final AccountInfo other = (AccountInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$accountOwnerName = this.getAccountOwnerName();
        final Object other$accountOwnerName = other.getAccountOwnerName();
        if (!Objects.equals(this$accountOwnerName, other$accountOwnerName))
            return false;
        final Object this$accountBalance = this.getAccountBalance();
        final Object other$accountBalance = other.getAccountBalance();
        if (!Objects.equals(this$accountBalance, other$accountBalance))
            return false;
        final Object this$accountNumber = this.getAccountNumber();
        final Object other$accountNumber = other.getAccountNumber();
        if (!Objects.equals(this$accountNumber, other$accountNumber))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AccountInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $accountOwnerName = this.getAccountOwnerName();
        result = result * PRIME + ($accountOwnerName == null ? 43 : $accountOwnerName.hashCode());
        final Object $accountBalance = this.getAccountBalance();
        result = result * PRIME + ($accountBalance == null ? 43 : $accountBalance.hashCode());
        final Object $accountNumber = this.getAccountNumber();
        result = result * PRIME + ($accountNumber == null ? 43 : $accountNumber.hashCode());
        return result;
    }

    public String toString() {
        return "AccountInfo(accountOwnerName=" + this.getAccountOwnerName() + ", accountBalance=" +
                this.getAccountBalance() + ", accountNumber=" + this.getAccountNumber() + ")";
    }

    public static class AccountInfoBuilder {
        private String accountOwnerName;
        private BigDecimal accountBalance;
        private String accountNumber;

        AccountInfoBuilder() {
        }

        public AccountInfoBuilder accountOwnerName(String accountOwnerName) {
            this.accountOwnerName = accountOwnerName;
            return this;
        }

        public AccountInfoBuilder accountBalance(BigDecimal accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }

        public AccountInfoBuilder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public AccountInfo build() {
            return new AccountInfo(accountOwnerName, accountBalance, accountNumber);
        }

        public String toString() {
            return "AccountInfo.AccountInfoBuilder(accountOwnerName=" + this.accountOwnerName +
                    ", accountBalance=" + this.accountBalance + ", accountNumber=" + this.accountNumber + ")";
        }
    }
}

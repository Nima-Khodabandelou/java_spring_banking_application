package com.nkh1987.banking.dto;

import java.util.Objects;

public class InquiryRequest {

    private String accountNumber;

    public InquiryRequest(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public InquiryRequest() {
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InquiryRequest)) return false;
        final InquiryRequest other = (InquiryRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$accountNumber = this.getAccountNumber();
        final Object other$accountNumber = other.getAccountNumber();
        if (!Objects.equals(this$accountNumber, other$accountNumber))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InquiryRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $accountNumber = this.getAccountNumber();
        result = result * PRIME + ($accountNumber == null ? 43 : $accountNumber.hashCode());
        return result;
    }

    public String toString() {
        return "InquiryRequest(accountNumber=" + this.getAccountNumber() + ")";
    }
}

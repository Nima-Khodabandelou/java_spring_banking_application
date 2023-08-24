package com.nkh1987.banking.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class TransferRequest {
    private String sourceAccountNumber;
    private String destinationAccountNumber;
    private BigDecimal amount;

    public TransferRequest(String sourceAccountNumber, String destinationAccountNumber, BigDecimal amount) {
        this.sourceAccountNumber = sourceAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
    }

    public TransferRequest() {
    }

    public String getSourceAccountNumber() {
        return this.sourceAccountNumber;
    }

    public String getDestinationAccountNumber() {
        return this.destinationAccountNumber;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setSourceAccountNumber(String sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public void setDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransferRequest)) return false;
        final TransferRequest other = (TransferRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$sourceAccountNumber = this.getSourceAccountNumber();
        final Object other$sourceAccountNumber = other.getSourceAccountNumber();
        if (!Objects.equals(this$sourceAccountNumber, other$sourceAccountNumber))
            return false;
        final Object this$destinationAccountNumber = this.getDestinationAccountNumber();
        final Object other$destinationAccountNumber = other.getDestinationAccountNumber();
        if (!Objects.equals(this$destinationAccountNumber, other$destinationAccountNumber))
            return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (!Objects.equals(this$amount, other$amount)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransferRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $sourceAccountNumber = this.getSourceAccountNumber();
        result = result * PRIME + ($sourceAccountNumber == null ? 43 : $sourceAccountNumber.hashCode());
        final Object $destinationAccountNumber = this.getDestinationAccountNumber();
        result = result * PRIME + ($destinationAccountNumber == null ? 43 : $destinationAccountNumber.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        return result;
    }

    public String toString() {
        return "TransferRequest(sourceAccountNumber=" + this.getSourceAccountNumber() + ", destinationAccountNumber=" + this.getDestinationAccountNumber() + ", amount=" + this.getAmount() + ")";
    }
}

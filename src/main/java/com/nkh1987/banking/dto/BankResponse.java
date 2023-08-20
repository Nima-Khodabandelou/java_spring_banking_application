package com.nkh1987.banking.dto;

import java.util.Objects;

public class BankResponse {

    private String responseCode;

    private String responseMessage;

    private AccountInfo accountInfo;

    public BankResponse(String responseCode, String responseMessage, AccountInfo accountInfo) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.accountInfo = accountInfo;
    }

    public BankResponse() {
    }

    public static BankResponseBuilder builder() {
        return new BankResponseBuilder();
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }

    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BankResponse)) return false;
        final BankResponse other = (BankResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$responseCode = this.getResponseCode();
        final Object other$responseCode = other.getResponseCode();
        if (!Objects.equals(this$responseCode, other$responseCode))
            return false;
        final Object this$responseMessage = this.getResponseMessage();
        final Object other$responseMessage = other.getResponseMessage();
        if (!Objects.equals(this$responseMessage, other$responseMessage))
            return false;
        final Object this$accountInfo = this.getAccountInfo();
        final Object other$accountInfo = other.getAccountInfo();
        if (!Objects.equals(this$accountInfo, other$accountInfo))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BankResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $responseCode = this.getResponseCode();
        result = result * PRIME + ($responseCode == null ? 43 : $responseCode.hashCode());
        final Object $responseMessage = this.getResponseMessage();
        result = result * PRIME + ($responseMessage == null ? 43 : $responseMessage.hashCode());
        final Object $accountInfo = this.getAccountInfo();
        result = result * PRIME + ($accountInfo == null ? 43 : $accountInfo.hashCode());
        return result;
    }

    public String toString() {
        return "BankResponse(responseCode=" + this.getResponseCode() + ", responseMessage=" +
                this.getResponseMessage() + ", accountInfo=" + this.getAccountInfo() + ")";
    }

    public static class BankResponseBuilder {
        private String responseCode;
        private String responseMessage;
        private AccountInfo accountInfo;

        BankResponseBuilder() {
        }

        public BankResponseBuilder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        public BankResponseBuilder responseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
            return this;
        }

        public BankResponseBuilder accountInfo(AccountInfo accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }

        public BankResponse build() {
            return new BankResponse(responseCode, responseMessage, accountInfo);
        }

        public String toString() {
            return "BankResponse.BankResponseBuilder(responseCode=" + this.responseCode +
                    ", responseMessage=" + this.responseMessage + ", accountInfo=" + this.accountInfo + ")";
        }
    }
}

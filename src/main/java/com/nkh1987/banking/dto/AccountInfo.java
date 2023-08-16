package com.nkh1987.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo {

    private String accountOwnerName;

    private BigDecimal accountBalance;

    private String accountNumber;
}

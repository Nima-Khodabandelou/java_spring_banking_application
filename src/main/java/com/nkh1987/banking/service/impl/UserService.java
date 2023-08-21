package com.nkh1987.banking.service.impl;

import com.nkh1987.banking.dto.BankResponse;
import com.nkh1987.banking.dto.CreditDebitRequest;
import com.nkh1987.banking.dto.InquiryRequest;
import com.nkh1987.banking.dto.UserRequest;
import com.nkh1987.banking.entity.User;

import java.util.List;


public interface  UserService {

    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceInquiry(InquiryRequest enquiryRequest);

    String nameInquiry(InquiryRequest request);

    BankResponse depositMoney(CreditDebitRequest request);

    List<User> getAllUsers();

    BankResponse withdrawMoney(CreditDebitRequest request);
}

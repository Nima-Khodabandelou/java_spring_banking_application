package com.nkh1987.banking.service;

import com.nkh1987.banking.dto.*;
import com.nkh1987.banking.entity.User;

import java.util.List;


public interface  UserService {

    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceInquiry(InquiryRequest enquiryRequest);
    String nameInquiry(InquiryRequest request);
    BankResponse depositMoney(DepositWithdrawRequest request);
    BankResponse transfer(TransferRequest request);
    List<User> getAllUsers();
    BankResponse withdrawMoney(DepositWithdrawRequest request);
}

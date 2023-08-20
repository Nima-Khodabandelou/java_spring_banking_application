package com.nkh1987.banking.service.impl;

import com.nkh1987.banking.dto.BankResponse;
import com.nkh1987.banking.dto.EnquiryRequest;
import com.nkh1987.banking.dto.UserRequest;
import com.nkh1987.banking.entity.User;

import java.util.List;


public interface  UserService {

    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);

    String nameEnquiry(EnquiryRequest request);

    List<User> getAllUsers();
}

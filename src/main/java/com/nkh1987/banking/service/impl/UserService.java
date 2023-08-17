package com.nkh1987.banking.service.impl;

import com.nkh1987.banking.dto.BankResponse;
import com.nkh1987.banking.dto.UserRequest;


public interface  UserService {

    BankResponse createAccount(UserRequest userRequest);
}

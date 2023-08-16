package com.nkh1987.banking.service.iml;

import com.nkh1987.banking.dto.BankResponse;
import com.nkh1987.banking.dto.UserRequest;
import com.nkh1987.banking.entity.User;
import com.nkh1987.banking.repository.UserRepository;
import com.nkh1987.banking.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public BankResponse createAccount(UserRequest userRequest) {

        /**
         * Create account for the new user
         * Save it to DB
         * Check if the user already has an account
         */
        User newUser = User.builder()
                .firstname(userRequest.getFirstname())
                .lastName(userRequest.getLastName())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .email(userRequest.getEmail())
                .cellPhoneNumber(userRequest.getCellPhoneNumber())
                .landlineNumber(userRequest.getLandlineNumber())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .status("ACTIVE")
                .build();
    }
}

package com.nkh1987.banking.service.impl;

import com.nkh1987.banking.dto.*;
import com.nkh1987.banking.entity.User;
import com.nkh1987.banking.repository.UserRepository;
import com.nkh1987.banking.utils.AccountUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public BankResponse createAccount(UserRequest userRequest) {

        /**
         * Create account for the new user
         * Save it to DB
         * Check if the user already has an account
         */

        if (userRepository.existsByEmail(userRequest.getEmail())) {
            return BankResponse.builder()
                    .responseCode(AccountUtils.ACCOUNT_EXISTS_CODE)
                    .responseMessage(AccountUtils.ACCOUNT_EXISTS_MESSAGE)
                    .accountInfo(null)
                    .build();

        }

        User newUser = User.builder()
                .firstname(userRequest.getFirstName())
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

        User savedUser = userRepository.save(newUser);

        return BankResponse.builder()
                .responseCode(AccountUtils.ACCOUNT_CREATION_SUCCESS)
                .responseMessage(AccountUtils.ACCOUNT_CREATION_MESSAGE)
                .accountInfo(AccountInfo.builder()
                        .accountOwnerName(savedUser.getFirstname() + " " + savedUser.getLastName() + " ")
                        .accountNumber(savedUser.getAccountNumber())
                        .accountBalance(savedUser.getAccountBalance())
                        .build())
                .build();
    }

    @Override
    public BankResponse balanceInquiry(InquiryRequest request) {

        Boolean isAccountExists = userRepository.existsByAccountNumber(request.getAccountNumber());

        if (!isAccountExists) {
            return BankResponse.builder()
                    .responseCode(AccountUtils.ACCOUNT_DOES_NOT_EXIST_CODE)
                    .responseMessage(AccountUtils.ACCOUNT_DOES_NOT_EXIST_MESSAGE)
                    .accountInfo(null)
                    .build();
        }

        User userFound = userRepository.findByAccountNumber(request.getAccountNumber());

        return BankResponse.builder()
                .responseCode(AccountUtils.ACCOUNT_FOUND_CODE)
                .responseMessage(AccountUtils.ACCOUNT_FOUND_MESSAGE)
                .accountInfo(AccountInfo.builder()
                        .accountNumber(userFound.getAccountNumber())
                        .accountBalance(userFound.getAccountBalance())
                        .accountOwnerName(userFound.getFirstname() + " " + userFound.getLastName())
                        .build())
                .build();
    }

    @Override
    public String nameInquiry(InquiryRequest request) {
        Boolean isAccountExists = userRepository.existsByAccountNumber(request.getAccountNumber());

        if (!isAccountExists) {
            return AccountUtils.ACCOUNT_DOES_NOT_EXIST_MESSAGE;
        }

        User userFound = userRepository.findByAccountNumber(request.getAccountNumber());

        return userFound.getFirstname() + " " + userFound.getLastName();
    }

    @Override
    public BankResponse creditAccount(CreditDebitRequest request) {
        Boolean isAccountExists = userRepository.existsByAccountNumber(request.getAccountNumber());

        if (!isAccountExists) {
            return BankResponse.builder()
                    .responseCode(AccountUtils.ACCOUNT_DOES_NOT_EXIST_CODE)
                    .responseMessage(AccountUtils.ACCOUNT_DOES_NOT_EXIST_MESSAGE)
                    .responseCode(null)
                    .build();
        }

        User userToCredit = userRepository.findByAccountNumber(request.getAccountNumber());
        userToCredit.setAccountBalance(userToCredit.getAccountBalance().add(request.getAmount()));
        userRepository.save(userToCredit);

        return BankResponse.builder()
                .responseCode(AccountUtils.ACCOUNT_DEPOSIT_SUCCESS_CODE)
                .responseMessage(AccountUtils.ACCOUNT_DEPOSIT_SUCCESS_MESSAGE)
                .accountInfo(AccountInfo.builder()
                        .accountOwnerName(userToCredit.getFirstname() + " " + userToCredit.getLastName())
                        .accountBalance(userToCredit.getAccountBalance())
                        .accountNumber(userToCredit.getAccountNumber())
                        .build())
                .build();

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

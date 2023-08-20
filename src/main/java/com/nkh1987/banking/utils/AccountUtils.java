package com.nkh1987.banking.utils;

import java.time.Year;

public class  AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "There is an Account associated with this email address";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account successfully created";
    public static final String ACCOUNT_DOES_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_DOES_NOT_EXIST_MESSAGE = "There is no account associated with this user";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_MESSAGE = "User associated with this account number is found";
    public static final String ACCOUNT_DEPOSIT_SUCCESS_CODE = "005";
    public static final String ACCOUNT_DEPOSIT_SUCCESS_MESSAGE = "User deposited money successfully";

    // For the sake of simplicity, account numbers are generated randomly
    public static String generateAccountNumber() {

        Year currentYear = Year.now();

        int min = 100000;

        int max = 999999;

        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        String year = String.valueOf(currentYear);

        String randomNumber = String.valueOf(randNumber);

        return year + randomNumber;
    }
}

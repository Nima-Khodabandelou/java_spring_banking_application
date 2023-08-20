package com.nkh1987.banking.controller;

import com.nkh1987.banking.dto.BankResponse;
import com.nkh1987.banking.dto.CreditDebitRequest;
import com.nkh1987.banking.dto.InquiryRequest;
import com.nkh1987.banking.dto.UserRequest;
import com.nkh1987.banking.entity.User;
import com.nkh1987.banking.service.impl.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("createAccount")
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

     @GetMapping("balanceInquiry")
     public BankResponse balanceInquiry(@RequestBody InquiryRequest request) {
        return userService.balanceInquiry(request);
     }

     @GetMapping("nameInquiry")
     public String nameInquiry(@RequestBody InquiryRequest request) {
        return userService.nameInquiry(request);
     }

     @PostMapping("depositMoney")
     public BankResponse depositMoney(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
     }

    @GetMapping("getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}

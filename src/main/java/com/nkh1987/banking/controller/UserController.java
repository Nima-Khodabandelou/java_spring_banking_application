package com.nkh1987.banking.controller;

import com.nkh1987.banking.dto.*;
import com.nkh1987.banking.entity.User;
import com.nkh1987.banking.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@Tag(name = "User Account Management APIs")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(
            summary = "Create user account",
            description = "Creating a new user and assigning an account Id"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @PostMapping("createAccount")
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @Operation(
            summary = "Perform balance inquiry",
            description = "Giving user the amount of money they have based on their account number"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"
    )
     @GetMapping("balanceInquiry")
     public BankResponse balanceInquiry(@RequestBody InquiryRequest request) {
        return userService.balanceInquiry(request);
     }

     @GetMapping("nameInquiry")
     public String nameInquiry(@RequestBody InquiryRequest request) {
        return userService.nameInquiry(request);
     }

     @PostMapping("deposit")
     public BankResponse depositMoney(@RequestBody CreditDebitRequest request) {
        return userService.depositMoney(request);
     }

     @PostMapping("withdraw")
     public BankResponse withdrawMoney(@RequestBody CreditDebitRequest request) {
        return userService.withdrawMoney(request);
     }

     @PostMapping("transfer")
     public BankResponse transfer(@RequestBody TransferRequest request) {
        return userService.transfer(request);
     }

    @GetMapping("getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}

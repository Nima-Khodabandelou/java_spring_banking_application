package com.nkh1987.banking.controller;

import com.nkh1987.banking.dto.BankResponse;
import com.nkh1987.banking.dto.EnquiryRequest;
import com.nkh1987.banking.dto.UserRequest;
import com.nkh1987.banking.entity.User;
import com.nkh1987.banking.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("createAccount")
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

     @GetMapping("balanceEnquiry")
     public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
     }

    @GetMapping("getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}

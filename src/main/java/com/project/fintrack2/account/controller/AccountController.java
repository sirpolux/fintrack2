package com.project.fintrack2.account.controller;


import com.project.fintrack2.account.dto.AccountResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @GetMapping
    public ResponseEntity<AccountResponseDto> getAllAccounts(){
        return null;
    }
}

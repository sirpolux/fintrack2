package com.project.fintrack2.account.service;

import com.project.fintrack2.account.dto.AccountRequestDto;
import com.project.fintrack2.account.dto.AccountResponseDto;
import com.project.fintrack2.account.service.inte.AccountServiceInterface;
import com.project.fintrack2.dto.PaginationRequestDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class AccountService implements AccountServiceInterface {
    @Override
    public ResponseEntity<AccountResponseDto> createAccount(AccountRequestDto requestDto) {
        return null;
    }

    @Override
    public ResponseEntity<AccountResponseDto> getAccount(Integer account_id) {
        return null;
    }

    @Override
    public ResponseEntity<List<AccountResponseDto>> getAllAccount(PaginationRequestDto paginationRequestDto) {
        return null;
    }

    @Override
    public ResponseEntity<AccountResponseDto> updateAccountDetails(AccountRequestDto accountRequestDto) {
        return null;
    }
}

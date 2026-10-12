package com.project.fintrack2.account.service;

import com.project.fintrack2.account.dto.AccountRequestDto;
import com.project.fintrack2.account.dto.AccountResponseDto;
import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.account.service.inte.AccountServiceInterface;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.mapper.AccountMapper;
import com.project.fintrack2.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RequiredArgsConstructor
public class AccountService implements AccountServiceInterface {

    private final AccountMapper accountMapper;
    private final AuthenticationContract auth;

    @Override
    public ResponseEntity<AccountResponseDto> createAccount(AccountRequestDto requestDto) {
        Account account = accountMapper.toAccount(requestDto);
        User user = auth.getAuthenticatedUser();
        account.setUser(user);

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

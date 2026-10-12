package com.project.fintrack2.account.service;

import com.project.fintrack2.account.dto.AccountRequestDto;
import com.project.fintrack2.account.dto.AccountResponseDto;
import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.account.model.AccountRepository;
import com.project.fintrack2.account.service.inte.AccountServiceInterface;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.exception.DuplicateAccountException;
import com.project.fintrack2.mapper.AccountMapper;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.utility.response.ResponseWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService implements AccountServiceInterface {

    private final AccountMapper accountMapper;
    private final AuthenticationContract auth;
    private final AccountRepository accountRepository;


    @Override
    public ResponseWrapper<AccountResponseDto> createAccount(AccountRequestDto requestDto) {
        Account account = accountMapper.toAccount(requestDto);
        User user = auth.getAuthenticatedUser();
        account.setUser(user);
        Boolean accountExist = accountRepository.existsByUserAndAccountNameAndAccountType(user, requestDto.getAccountName(), requestDto.getAccountType());
        if (accountExist){
            throw  new DuplicateAccountException("Account type and name already exists");
        }
        Account createdAccount = accountRepository.save(account);
        return ResponseWrapper.success("Account created",accountMapper.toAccountResponseDto(createdAccount), HttpStatus.OK);
    }

    @Override
    public ResponseWrapper<AccountResponseDto> getAccount(Integer account_id) {
        return null;
    }

    @Override
    public ResponseWrapper<List<AccountResponseDto>> getAllAccount(PaginationRequestDto paginationRequestDto) {
        return null;
    }

    @Override
    public ResponseWrapper<AccountResponseDto> updateAccountDetails(AccountRequestDto accountRequestDto) {
        return null;
    }
}

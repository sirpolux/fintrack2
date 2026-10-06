package com.project.fintrack2.account.service.inte;

import com.project.fintrack2.account.dto.AccountRequestDto;
import com.project.fintrack2.account.dto.AccountResponseDto;
import com.project.fintrack2.dto.PaginationRequestDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AccountServiceInterface {
    ResponseEntity<AccountResponseDto> createAccount(AccountRequestDto requestDto);
    ResponseEntity<AccountResponseDto> getAccount (Integer account_id);
    ResponseEntity<List<AccountResponseDto>> getAllAccount(PaginationRequestDto paginationRequestDto);
    ResponseEntity<AccountResponseDto> updateAccountDetails(AccountRequestDto accountRequestDto);
}

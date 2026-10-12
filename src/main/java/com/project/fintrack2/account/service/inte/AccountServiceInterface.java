package com.project.fintrack2.account.service.inte;

import com.project.fintrack2.account.dto.AccountRequestDto;
import com.project.fintrack2.account.dto.AccountResponseDto;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.utility.response.ResponseWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AccountServiceInterface {
    ResponseWrapper<AccountResponseDto> createAccount(AccountRequestDto requestDto);
    ResponseWrapper<AccountResponseDto> getAccount (Integer account_id);
    ResponseWrapper<List<AccountResponseDto>> getAllAccount(PaginationRequestDto paginationRequestDto);
    ResponseWrapper<AccountResponseDto> updateAccountDetails(AccountRequestDto accountRequestDto);
}

package com.project.fintrack2.mapper;

import com.project.fintrack2.account.dto.AccountRequestDto;
import com.project.fintrack2.account.dto.AccountResponseDto;
import com.project.fintrack2.account.model.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountMapper {
    public Account toAccount(AccountRequestDto requestDto){
        Account account = new Account();
        account.setAccountName(requestDto.getAccountName());
        account.setAccountType(requestDto.getAccountType());
        account.setCurrency(requestDto.getCurrency());
        account.setVersion(1);
        account.setAccountBalance(BigDecimal.valueOf(0));
        return account;
    }


    public AccountResponseDto toAccountResponseDto(Account account){
       return AccountResponseDto
                .builder()
               .accountBalance(account.getAccountBalance())
               .accountName(account.getAccountName())
               .accountType(account.getAccountType())
               .currency(account.getCurrency())
               .version(account.getVersion())
               .build();
    }
}

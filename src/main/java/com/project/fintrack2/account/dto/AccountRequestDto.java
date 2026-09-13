package com.project.fintrack2.account.dto;

import com.project.fintrack2.Status;
import com.project.fintrack2.account.enums.AccountType;
import com.project.fintrack2.account.model.Currency;
import com.project.fintrack2.user.model.User;
import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AccountRequestDto {
    private String accountName;
    private AccountType accountType;
    private Currency currency;
    private Status status;
}

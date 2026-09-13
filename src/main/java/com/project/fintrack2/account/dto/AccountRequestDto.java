package com.project.fintrack2.account.dto;

import com.project.fintrack2.Status;
import com.project.fintrack2.account.enums.AccountType;
import com.project.fintrack2.account.model.Currency;
import com.project.fintrack2.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AccountRequestDto {
    private Long id;
    private User user_id;
    private String accountName;
    private AccountType accountType;
    private Currency currency;
    private Float accountBalance;
    private Status status;
    private LocalDate dateCreated;
    private LocalDate lastUpdated;
}

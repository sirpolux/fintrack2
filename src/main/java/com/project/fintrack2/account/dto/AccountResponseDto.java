package com.project.fintrack2.account.dto;

import com.project.fintrack2.Status;
import com.project.fintrack2.account.enums.AccountType;
import com.project.fintrack2.account.model.Currency;
import com.project.fintrack2.user.model.Users;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AccountResponseDto {
    private Long id;
    private Users user_id;
    private String accountName;
    private AccountType accountType;
    private Currency currency;
    private Float accountBalance;
    private Status status;
    private LocalDate dateCreated;
    private LocalDate lastUpdated;
}

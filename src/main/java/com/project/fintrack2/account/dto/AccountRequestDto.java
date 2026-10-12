package com.project.fintrack2.account.dto;

import com.project.fintrack2.Status;
import com.project.fintrack2.account.enums.AccountType;
import com.project.fintrack2.account.model.Currency;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AccountRequestDto {
    @NotNull
    private String accountName;
    @NotNull
    private AccountType accountType;
    @NotNull
    private Currency currency;
    @NotNull
    private Status status;
}

package com.project.fintrack2.transaction.dto.response;

import com.project.fintrack2.account.dto.AccountResponseDto;
import com.project.fintrack2.categories.model.Category;
import com.project.fintrack2.transaction.enums.TransactionStatus;
import com.project.fintrack2.user.model.User;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionResponseDto {
    private Long id;
    private String transactionReference;
    private Category category;
    private User userId;
    private AccountResponseDto account;
    private String currencyCode;
    private BigDecimal amount;
    private String description;
    private LocalDate transactionDate;
    private TransactionStatus status;
    private String reference; //for external transaction reference
    private LocalDate createdAt;

}

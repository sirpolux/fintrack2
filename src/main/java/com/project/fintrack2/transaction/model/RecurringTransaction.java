package com.project.fintrack2.transaction.model;

import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.categories.model.Category;
import com.project.fintrack2.transaction.enums.TransactionStatus;
import com.project.fintrack2.transaction.enums.TransactionType;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RecurringTransaction {
    private Long id;
    private User userId;
    private Account account;
    private Category categoryId;
    private TransactionType transactionType;
    private TransactionStatus transactionStatus;
    private BigDecimal amount;
    private Integer frequency;
    private String description;
    private LocalDate endDate;
    private LocalDate nextExecutionDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}

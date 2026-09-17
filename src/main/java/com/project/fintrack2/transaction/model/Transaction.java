package com.project.fintrack2.transaction.model;


import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.account.model.Currency;
import com.project.fintrack2.categories.model.Category;
import com.project.fintrack2.transaction.enums.TransactionStatus;
import com.project.fintrack2.user.model.User;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {

    private Long id;
    private String transactionReference;
    private Category category;
    private User userId;
    private Account accountId;
    private String currencyCode;
    private BigDecimal amount;
    private String description;
    private  LocalDate transactionDate;


    private TransactionStatus status;
    private String reference; //for external transaction reference

    @CreationTimestamp
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate updatedAt;


}

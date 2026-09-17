package com.project.fintrack2.transaction.model;

import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.user.model.User;

import java.math.BigDecimal;

public class RecurringTransaction {
    private Long id;
    private User userId;
    private Account account;



    private BigDecimal amount;
}

package com.project.fintrack2.transaction.model;


import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.categories.model.Category;
import com.project.fintrack2.transaction.enums.TransactionStatus;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true,updatable = false)
    private String transactionReference;
    @ManyToOne
    private Category category;
    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private User userId;
    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false, updatable = false)
    private Account accountId;
    private String currencyCode;
    private BigDecimal amount;

    @Column(length = 500)
    private String description;
    private  LocalDate transactionDate;


    @EnumeratedValue
    private TransactionStatus status;
    private String reference; //for external transaction reference

    @CreationTimestamp
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate updatedAt;


}

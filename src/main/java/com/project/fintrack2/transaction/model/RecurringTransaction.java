package com.project.fintrack2.transaction.model;

import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.categories.model.Category;
import com.project.fintrack2.transaction.enums.TransactionStatus;
import com.project.fintrack2.transaction.enums.TransactionType;
import com.project.fintrack2.user.model.Users;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RecurringTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Users userId;
    @ManyToOne
    private Account account;
    @ManyToOne
    private Category categoryId;
    @EnumeratedValue
    private TransactionType transactionType;
    @EnumeratedValue
    private TransactionStatus transactionStatus;
    @OneToMany
    private List<Transaction> transactions;
    private BigDecimal amount;
    private Integer frequency;
    private String description;
    private LocalDate endDate;
    private LocalDate nextExecutionDate;
    @CreationTimestamp
    private LocalDate createdAt;
    @UpdateTimestamp
    private LocalDate updatedAt;
}

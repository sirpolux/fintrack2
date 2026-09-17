package com.project.fintrack2.budget.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.fintrack2.budget.enums.BudgetStatus;
import com.project.fintrack2.categories.model.Category;
import com.project.fintrack2.transaction.model.Transaction;
import com.project.fintrack2.user.model.User;
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
public class Budget {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private User userId;
    @ManyToOne
    private Category category;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private BudgetFrequency frequency;
    @Column(nullable = false, updatable = false)
    private BigDecimal amount;


    @OneToMany
    @JsonIgnore
    private List<Transaction> transactions;

    @EnumeratedValue
    private BudgetStatus budgetStatus;

    private LocalDate startDate;
    private LocalDate endDate;

    @CreationTimestamp
    private LocalDate createdAt;
    @UpdateTimestamp
    private LocalDate updatedAt;


}

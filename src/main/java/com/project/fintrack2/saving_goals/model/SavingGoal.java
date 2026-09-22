package com.project.fintrack2.saving_goals.model;

import com.project.fintrack2.account.model.Account;
import com.project.fintrack2.saving_goals.enums.SavingStatus;
import com.project.fintrack2.user.model.Users;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SavingGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Users userId;
    private BigDecimal targetAmount;
    private BigDecimal currentAmount;
    @EnumeratedValue
    private SavingStatus status;
    private LocalDate targetDate;
    @ManyToOne
    private Account accountId;

    private LocalDate createdAt;
    private LocalDate updatedAt;


}

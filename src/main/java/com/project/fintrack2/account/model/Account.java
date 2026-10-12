package com.project.fintrack2.account.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.fintrack2.Status;
import com.project.fintrack2.account.enums.AccountType;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnore
    @JsonBackReference
    private User user;

    private String accountName;

    @Enumerated
    private AccountType accountType;
    @ManyToOne
    private Currency currency;
    private Integer version;
    private BigDecimal accountBalance;

    @Enumerated
    private Status status;

    @CreationTimestamp
    private LocalDate dateCreated;
    @UpdateTimestamp
    private LocalDate updatedAt;
}

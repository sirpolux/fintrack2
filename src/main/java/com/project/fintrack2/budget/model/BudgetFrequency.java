package com.project.fintrack2.budget.model;

import com.project.fintrack2.budget.enums.FrequencyType;
import com.project.fintrack2.budget.enums.FrequencyUnit;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import tools.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.util.Date;


@Entity
public class BudgetFrequency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String code;
    @EnumeratedValue
    private FrequencyType frequencyType;
    private Integer frequencyValue;
    @EnumeratedValue
    private FrequencyUnit frequencyUnit;
    private boolean is_system = false;
    @ManyToOne
    private User userId;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}

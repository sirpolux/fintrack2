package com.project.fintrack2.budget.model;

import com.project.fintrack2.budget.enums.FrequencyType;
import com.project.fintrack2.budget.enums.FrequencyUnit;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
    private boolean isSystem = false;
    private boolean isActive;
    @ManyToOne
    private User userId;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}

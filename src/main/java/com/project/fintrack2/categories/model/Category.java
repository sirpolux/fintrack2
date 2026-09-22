package com.project.fintrack2.categories.model;

import com.project.fintrack2.categories.enums.CategoryType;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User userId;
    private String name;
    private String description;
    @EnumeratedValue
    private CategoryType type;
    private boolean active=true;
    private boolean  isSystem = false;
    private LocalDate createdAt;

}

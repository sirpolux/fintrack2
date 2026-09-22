package com.project.fintrack2.categories.dto;


import com.project.fintrack2.categories.enums.CategoryType;
import com.project.fintrack2.user.model.Users;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryRequestDto {
    private Long id;
    private Users user;
    private String name;
    private String description;
    private CategoryType type;
    private boolean active=true;
    private boolean  isSystem = false;
    private LocalDate createdAt;
}

package com.project.fintrack2.user.dto.response;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoleResponseDto {
    private String name;
    private String description;
}

package com.project.fintrack2.user.dto.request;

import lombok.*;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateUserRoleDto {
    private Long roleId;
    private UUID userId;
}

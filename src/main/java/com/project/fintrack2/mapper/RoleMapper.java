package com.project.fintrack2.mapper;

import com.project.fintrack2.user.dto.request.RoleResponseDto;
import com.project.fintrack2.user.model.Role;

public class RoleMapper {

    public static RoleResponseDto toRoleResponseDto(Role roles){
        return RoleResponseDto
                .builder()
                .name(roles.getName())
                .description(roles.getDescription())
                .build();
    }
}

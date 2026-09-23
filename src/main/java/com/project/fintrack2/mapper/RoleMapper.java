package com.project.fintrack2.mapper;

import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.user.model.Role;

public class RoleMapper {

    public static RoleResponseDto toRoleResponseDto(Role roles){
        return RoleResponseDto
                .builder()
                .name(roles.getName())
                .description(roles.getDescription())
                .build();
    }


    public static Role toRole(RoleRequestDto requestDto){
        Role role = new Role();
        role.setName(requestDto.getName());
        role.setDescription(requestDto.getDescription());
        return role;
    }
}

package com.project.fintrack2.mapper;

import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.model.User;

public class UserMapper {

    public static User toUser(UserRequestDto userRequest){
        return User
                .builder()
                .firstName(userRequest.getFirstname())
                .lastName(userRequest.getLastname())
                .password(userRequest.getPassword())
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .build();
    }

    public static UserResponseDto toUserResponseDto(User user){
        return UserResponseDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .roles(user.getRoles()!=null? user.getRoles()
                        .stream()
                        .map(RoleMapper::toRoleResponseDto)
                        .toList():null)
                .build();
    }
}

package com.project.fintrack2.mapper;

import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserMapper {

    private final RoleMapper roleMapper;

    public  User toUser(UserRequestDto userRequest){
        return User
                .builder()
                .firstName(userRequest.getFirstname())
                .lastName(userRequest.getLastname())
                .password(userRequest.getPassword())
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .build();
    }

    public  UserResponseDto toUserResponseDto(User user){
        return UserResponseDto.builder()
                .firstName(user.getFirstName())
                .uuid(user.getUuid())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .roles(user.getRoles()!=null? user.getRoles()
                        .stream()
                        .map(roleMapper::toRoleResponseDto)
                        .toList():null)
                .build();
    }
}

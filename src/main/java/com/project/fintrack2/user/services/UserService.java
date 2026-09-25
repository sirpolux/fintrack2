package com.project.fintrack2.user.services;

import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.exception.EmailAlreadyExistsException;
import com.project.fintrack2.exception.PasswordAndConfirmPasswordDoNotMatchException;
import com.project.fintrack2.mapper.UserMapper;
import com.project.fintrack2.user.dto.request.UpdateUserRoleDto;
import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.enums.Status;
import com.project.fintrack2.user.model.Role;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.user.repo.RoleRepository;
import com.project.fintrack2.user.repo.UserRepository;
import com.project.fintrack2.user.services.contract.UserServiceInt;
import com.project.fintrack2.utility.Utility;
import com.project.fintrack2.utility.response.ResponseWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInt {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final AuthenticationContract auth;
    private final Utility utils;
    private final RoleRepository roleRepository;

    @Override
    public ResponseWrapper<UserResponseDto> createAccount(UserRequestDto userRequestDto) {
        if (!userRequestDto.getPassword().equals(userRequestDto.getConfirmPassword())){
            throw  new PasswordAndConfirmPasswordDoNotMatchException("Password and password confirmation must match");
        }
        if(userRepository.existsByEmail(userRequestDto.getEmail())){
            throw  new EmailAlreadyExistsException("This email address is not available");
        }
        User user = userMapper.toUser(userRequestDto);
        user.setPassword(Utility.encoder.encode(userRequestDto.getPassword()));
        User createdUser = userRepository.save(user);
        return ResponseWrapper.success("User account created", userMapper.toUserResponseDto(createdUser), HttpStatus.CREATED);


    }

    @Override
    public ResponseWrapper<UserResponseDto> updateAccount(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public ResponseWrapper<UserResponseDto> updateAccountStatus(Status status) {
        return null;
    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public ResponseWrapper<UserResponseDto> assignRoleToUser(UpdateUserRoleDto request) {
        User user = auth.getAuthenticatedUser();
        User targetUser = (User)utils.unwrapOptional(userRepository.findByUuid(request.getUserId()), "user");
        Role role = (Role)utils.unwrapOptional(roleRepository.findById(request.getRoleId()), "role");
        //check  if user already has role
        targetUser.addRole(role);
        return ResponseWrapper.success("New Role assigned",
                userMapper.toUserResponseDto(userRepository.save(targetUser)),HttpStatus.OK);
    }

    @Override
    public ResponseWrapper<List<UserResponseDto>> fetchUsers() {
        List<User> users= userRepository.findAll();
        return ResponseWrapper.success("Users retrieved",  users
                .stream()
                .map(userMapper::toUserResponseDto)
                .toList()
                , HttpStatus.OK);
    }
}

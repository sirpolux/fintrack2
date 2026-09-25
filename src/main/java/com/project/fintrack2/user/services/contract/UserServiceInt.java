package com.project.fintrack2.user.services.contract;

import com.project.fintrack2.user.dto.request.UpdateUserRoleDto;
import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.enums.Status;
import com.project.fintrack2.utility.response.ResponseWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserServiceInt {
    ResponseWrapper<UserResponseDto> createAccount(UserRequestDto userRequestDto);
    ResponseWrapper<UserResponseDto> updateAccount(UserRequestDto userRequestDto);
    ResponseWrapper<UserResponseDto> updateAccountStatus(Status status);
    void deleteAccount ();
    ResponseWrapper<UserResponseDto> assignRoleToUser(UpdateUserRoleDto request);
    ResponseWrapper<List<UserResponseDto>> fetchUsers();

}

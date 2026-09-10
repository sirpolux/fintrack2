package com.project.fintrack2.user.services.contract;

import com.project.fintrack2.user.dto.UserRequestDto;
import com.project.fintrack2.user.dto.UserResponseDto;
import com.project.fintrack2.user.enums.Status;

import java.util.UUID;

public interface UserServiceContract {
    UserResponseDto createAccount(UserRequestDto userRequestDto);
    UserResponseDto updateAccount(UserRequestDto userRequestDto);
    UserResponseDto updateAccountStatus(Status status);
    void deleteAccount ();

}

package com.project.fintrack2.user.services.contract;

import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.enums.Status;
import com.project.fintrack2.utility.response.ResponseWrapper;

public interface UserServiceInt {
    ResponseWrapper<UserResponseDto> createAccount(UserRequestDto userRequestDto);
    ResponseWrapper<UserResponseDto> updateAccount(UserRequestDto userRequestDto);
    ResponseWrapper<UserResponseDto> updateAccountStatus(Status status);
    void deleteAccount ();

}

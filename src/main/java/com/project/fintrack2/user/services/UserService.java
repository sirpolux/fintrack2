package com.project.fintrack2.user.services;


import com.project.fintrack2.user.dto.UserRequestDto;
import com.project.fintrack2.user.dto.UserResponseDto;
import com.project.fintrack2.user.enums.Status;
import com.project.fintrack2.user.services.contract.UserServiceContract;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserServiceContract {
    @Override
    public UserResponseDto createAccount(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public UserResponseDto updateAccount(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public UserResponseDto updateAccountStatus(Status status) {
        return null;
    }

    @Override
    public void deleteAccount() {

    }
}

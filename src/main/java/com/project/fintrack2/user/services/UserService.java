package com.project.fintrack2.user.services;

import com.project.fintrack2.exception.EmailAlreadyExistsException;
import com.project.fintrack2.exception.PasswordAndConfirmPasswordDoNotMatchException;
import com.project.fintrack2.mapper.UserMapper;
import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.enums.Status;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.user.repo.UserRepository;
import com.project.fintrack2.user.services.contract.UserServiceInt;
import com.project.fintrack2.utility.Utility;
import com.project.fintrack2.utility.response.ResponseWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInt {
    private final UserRepository userRepository;

    @Override
    public ResponseWrapper<UserResponseDto> createAccount(UserRequestDto userRequestDto) {
        if (!userRequestDto.getPassword().equals(userRequestDto.getConfirmPassword())){
            throw  new PasswordAndConfirmPasswordDoNotMatchException("Password and password confirmation must match");
        }
        if(userRepository.existsByEmail(userRequestDto.getEmail())){
            throw  new EmailAlreadyExistsException("This email address is not available");
        }
        User user = UserMapper.toUser(userRequestDto);
        user.setPassword(Utility.encoder.encode(userRequestDto.getPassword()));
        User createdUser = userRepository.save(user);
        return ResponseWrapper.success("User account created", UserMapper.toUserResponseDto(createdUser), HttpStatus.CREATED);


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
}

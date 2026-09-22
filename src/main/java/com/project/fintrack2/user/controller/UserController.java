package com.project.fintrack2.user.controller;


import com.project.fintrack2.user.dto.UserRequestDto;
import com.project.fintrack2.user.dto.UserResponseDto;
import com.project.fintrack2.user.services.contract.UserServiceInt;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users/")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceInt userService;
    @PostMapping
    public UserResponseDto createAccount(@RequestBody @Valid UserRequestDto requestDto){
        return userService.createAccount(requestDto);
    }
}

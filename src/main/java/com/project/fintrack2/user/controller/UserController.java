package com.project.fintrack2.user.controller;


import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.services.UserService;
import com.project.fintrack2.user.services.contract.UserServiceInt;
import com.project.fintrack2.utility.response.ResponseWrapper;
import jakarta.validation.Valid;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceInt userService;

    @PostMapping
    public ResponseEntity<ResponseWrapper<UserResponseDto>> createAccount(@RequestBody @Valid UserRequestDto requestDto){
        return ResponseEntity.ok().body(userService.createAccount(requestDto));
    }
}

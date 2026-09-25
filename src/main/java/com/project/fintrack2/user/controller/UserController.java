package com.project.fintrack2.user.controller;


import com.project.fintrack2.user.dto.request.UpdateUserRoleDto;
import com.project.fintrack2.user.dto.request.UserRequestDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.services.UserService;
import com.project.fintrack2.user.services.contract.UserServiceInt;
import com.project.fintrack2.utility.response.ResponseWrapper;
import jakarta.validation.Valid;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceInt userService;



    @PostMapping
    public ResponseEntity<ResponseWrapper<UserResponseDto>> createAccount(@RequestBody @Valid UserRequestDto requestDto){
        return ResponseEntity.ok().body(userService.createAccount(requestDto));
    }

    @PostMapping("/assign-role")
    public ResponseEntity<ResponseWrapper<UserResponseDto>> addRoleToUser(@RequestBody @Valid UpdateUserRoleDto requestDto){
        return ResponseEntity.ok(userService.assignRoleToUser(requestDto));
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper<List<UserResponseDto>>> fetchUsers(){
        return ResponseEntity.ok(userService.fetchUsers());
    }
}

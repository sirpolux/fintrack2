package com.project.fintrack2.user.controller;


import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.request.UpdateUserRoleDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.services.contract.RoleServiceInterface;
import com.project.fintrack2.utility.response.ResponseWrapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/v1/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleServiceInterface roleServiceInterface;

    @PostMapping
    public ResponseEntity<ResponseWrapper<RoleResponseDto>> save(@RequestBody  @Valid RoleRequestDto requestDto){
        return ResponseEntity.ok(roleServiceInterface.save(requestDto));
    }




}

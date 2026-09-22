package com.project.fintrack2.user.services.contract;

import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.utility.response.ResponseWrapper;
import com.sun.security.auth.UserPrincipal;
import org.springframework.security.core.Authentication;

public class RoleService implements RoleServiceInterface{
    @Override
    public ResponseWrapper<RoleResponseDto> save(RoleRequestDto requestDto) {

        return null;
    }

    @Override
    public ResponseWrapper<RoleResponseDto> find(String roleId) {
        return null;
    }

    @Override
    public ResponseWrapper<RoleResponseDto> fetchAll(int page, int size, String sort) {
        return null;
    }

    @Override
    public ResponseWrapper<RoleRequestDto> updateRole(RoleRequestDto requestDto) {
        return null;
    }

    @Override
    public void deleteRole(String roleId) {

    }
}

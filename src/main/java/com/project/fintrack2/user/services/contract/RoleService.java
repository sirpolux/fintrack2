package com.project.fintrack2.user.services.contract;

import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.user.repo.RoleRepository;
import com.project.fintrack2.utility.response.ResponseWrapper;
import com.sun.security.auth.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;


@RequiredArgsConstructor
public class RoleService implements RoleServiceInterface{

    private final RoleRepository roleRepository;
    @Override
    public ResponseWrapper<RoleResponseDto> save(RoleRequestDto requestDto) {

        return null;
    }

    @Override
    public ResponseWrapper<RoleResponseDto> find(String roleId) {
        return null;
    }

    @Override
    public ResponseWrapper<RoleResponseDto> fetchAll(PaginationRequestDto pageData) {
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

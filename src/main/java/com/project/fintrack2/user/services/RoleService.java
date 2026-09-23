package com.project.fintrack2.user.services;

import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.mapper.RoleMapper;
import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.user.model.Role;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.user.repo.RoleRepository;
import com.project.fintrack2.user.services.contract.RoleServiceInterface;
import com.project.fintrack2.utility.response.ResponseWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@RequiredArgsConstructor
public class RoleService implements RoleServiceInterface {

    private final AuthenticationContract auth;
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;
    @Override
    public ResponseWrapper<RoleResponseDto> save(RoleRequestDto requestDto) {
        User user = auth.getAuthenticatedUser();
        Role role = RoleMapper.toRole(requestDto);
        role.setCreatedBy(user);
        Role createdRole = roleRepository.save(role);
        return ResponseWrapper.success("Role created",RoleMapper.toRoleResponseDto(createdRole), HttpStatus.CREATED);
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

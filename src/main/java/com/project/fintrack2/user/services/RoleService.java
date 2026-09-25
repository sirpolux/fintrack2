package com.project.fintrack2.user.services;

import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.exception.ResourceNotFoundException;
import com.project.fintrack2.mapper.RoleMapper;
import com.project.fintrack2.mapper.UserMapper;
import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.request.UpdateUserRoleDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.model.Role;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.user.repo.RoleRepository;
import com.project.fintrack2.user.repo.UserRepository;
import com.project.fintrack2.user.services.contract.RoleServiceInterface;
import com.project.fintrack2.utility.Utility;
import com.project.fintrack2.utility.response.ResponseWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService implements RoleServiceInterface {

    private final AuthenticationContract auth;
    private final RoleRepository roleRepository;
    private final Utility utils;
    private final RoleMapper roleMapper;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public ResponseWrapper<RoleResponseDto> save(RoleRequestDto requestDto) {
        User user = auth.getAuthenticatedUser();
        Role role = roleMapper.toRole(requestDto);
        role.setCreatedBy(user);
        Role createdRole = roleRepository.save(role);
        return ResponseWrapper.success("Role created",roleMapper.toRoleResponseDto(createdRole), HttpStatus.CREATED);
    }

    @Override
    public ResponseWrapper<RoleResponseDto> find(Long roleId) {
        Optional<Role> role = roleRepository.findById(roleId);
        if (role.isEmpty()){
            throw new ResourceNotFoundException("Resource was not found for the provided Id");
        }
        return ResponseWrapper.success("Found", roleMapper.toRoleResponseDto(role.get()),HttpStatus.CREATED) ;
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

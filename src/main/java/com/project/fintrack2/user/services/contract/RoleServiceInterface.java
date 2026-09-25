package com.project.fintrack2.user.services.contract;

import com.project.fintrack2.dto.PaginationRequestDto;
import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.request.UpdateUserRoleDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.utility.response.ResponseWrapper;

public interface RoleServiceInterface {
    ResponseWrapper<RoleResponseDto> save(RoleRequestDto requestDto);
    ResponseWrapper<RoleResponseDto> find(Long roleId);
    ResponseWrapper<RoleResponseDto> fetchAll(PaginationRequestDto  pageData);
    ResponseWrapper<RoleRequestDto> updateRole(RoleRequestDto requestDto);
    void deleteRole(String roleId);

}

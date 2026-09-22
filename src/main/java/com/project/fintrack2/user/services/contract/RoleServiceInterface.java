package com.project.fintrack2.user.services.contract;

import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.utility.response.ResponseWrapper;

public interface RoleServiceInterface {
    ResponseWrapper<RoleResponseDto> save(RoleRequestDto requestDto);
    ResponseWrapper<RoleResponseDto> find(String roleId);
    ResponseWrapper<RoleResponseDto> fetchAll(int page, int size, String sort);
    ResponseWrapper<RoleRequestDto> updateRole(RoleRequestDto requestDto);
    void deleteRole(String roleId);
}

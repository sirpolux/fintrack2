package com.project.fintrack2.user.repo;

import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.utility.response.ResponseWrapper;

import java.util.List;

public interface RoleRepository {
        ResponseWrapper<RoleResponseDto> save(RoleRequestDto roleRequestDto);
        ResponseWrapper<List<RoleResponseDto>> getAll();
        ResponseWrapper<RoleResponseDto> update(RoleRequestDto roleRequestDto);

}

package com.project.fintrack2.user.repo;

import com.project.fintrack2.user.dto.request.RoleRequestDto;
import com.project.fintrack2.user.dto.response.RoleResponseDto;
import com.project.fintrack2.user.model.Role;
import com.project.fintrack2.utility.response.ResponseWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {


}

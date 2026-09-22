package com.project.fintrack2.user.repo;

import com.project.fintrack2.user.model.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {
    Users findByEmail(String email);

    boolean existsByEmail(@NotNull(message = "Email is required") @Email(message = "Invalid email format") String email);
}

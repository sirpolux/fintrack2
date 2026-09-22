package com.project.fintrack2.user.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PasswordUpdateRequestDto {
    @NotNull(message = "Current password is required")
    private String currentPassword;
    @NotNull(message = "New password is required")
    private String newPassword;
    @NotNull(message = "Confirm password is required")
    private String confirmPassword;
}

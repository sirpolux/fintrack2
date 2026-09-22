package com.project.fintrack2.user.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
    @NotNull(message = "Firstname is required")
    private String firstname;
    @NotNull(message = "Lastname is required")
    private String lastname;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;
    @NotNull(message = "Phone number is required")
    private String phoneNumber;
//    @NotNull(message = "Role is required")
    private Long roleId;

    @NotNull(message = "Password is required")
    @Size(min = 8, message = "Password must have at least 8 characters")
    private String password;
    @NotNull(message = "Confirm password is required")
    @Size(min = 8, message = "confirm password must have at least 8 characters")
    private String confirmPassword;
}

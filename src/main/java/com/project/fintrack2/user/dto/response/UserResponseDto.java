package com.project.fintrack2.user.dto.response;

import com.project.fintrack2.user.enums.Status;
import lombok.*;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserResponseDto {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private Status status;
    private List<RoleResponseDto> roles;
}

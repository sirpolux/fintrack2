package com.project.fintrack2.audit.dto.response;

import com.project.fintrack2.audit.enums.Status;
import com.project.fintrack2.user.dto.response.UserResponseDto;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditResponseDto {
    private Long id;
    private Long userId;
    private String entityType;
    private String entityId;
    private String action;
    private String description;
    private String ipAddress;
    private String requestId;
    private Status status;
    private LocalDate createdAt;
}

package com.project.fintrack2.audit.model;


import com.project.fintrack2.audit.enums.Status;
import com.project.fintrack2.user.model.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private User userId;
    private String entityType;
    private String entityId;
    private String action;
    private String description;

    private String ipAddress;
    private String requestId;
    private Status status;

    @CreationTimestamp
    private LocalDate createdAt;

}

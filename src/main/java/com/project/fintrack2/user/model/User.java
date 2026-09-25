package com.project.fintrack2.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.fintrack2.user.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;


import java.time.LocalDateTime;
import java.util.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    @JdbcTypeCode(SqlTypes.CHAR)
    private UUID uuid;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    @Email
    private String email;
    private String password;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Status status;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();


    public Set<Role> addRole(Role role){
        this.roles.add(role);
        return this.roles;
    }

    private LocalDateTime createAt;
    private LocalDateTime updatedAt;


    @PrePersist

    private void onCreate(){
        if(uuid ==null){
            uuid = UUID.randomUUID();
        }
    }

}

package com.project.fintrack2.annotation.aspect;

import com.project.fintrack2.annotation.RequiresRole;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.user.model.Role;
import com.project.fintrack2.user.model.User;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class RoleAspect {
    private final AuthenticationContract auth;

    @Before("@annotation(requiresRole)")
    public void requiresRole(RequiresRole requiresRole){
        String role = requiresRole.value();
        if(!hasPermission(role)){
            throw new AccessDeniedException("You do not have the required role to access this resource: "+role);
        }
    }

    private boolean hasPermission(String value){
        User user = auth.getAuthenticatedUser();
        for(Role role: user.getRoles()){
            if (role.getName().equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }

}

package com.project.fintrack2.annotation.aspect;


import com.project.fintrack2.annotation.RequiresPermission;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.user.model.Permission;
import com.project.fintrack2.user.model.Role;
import com.project.fintrack2.user.model.User;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Aspect
@Component
@RequiredArgsConstructor
public class PermissionAspect {

    private final AuthenticationContract auth;

    @Before("@annotation(requiresPermission)")
    public void checkPermission(RequiresPermission requiresPermission){
        String permission = requiresPermission.value();
        if(hasPermission(permission)){
            throw new AccessDeniedException
                    ("You do not have the required permission to access this resource: "+ permission);
        }
    }

    private boolean hasPermission(String requiredPermission){
        User user = auth.getAuthenticatedUser();
        Set<Role> roles = user.getRoles();
        for(Role role: roles){
            List<Permission> permissionList = role.getPermissions();
            for (Permission permission: permissionList){
                if (requiredPermission.equalsIgnoreCase(permission.getName())){
                    return true;
                }
            }
        }
        return false;
    }

}

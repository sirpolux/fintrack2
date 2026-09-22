package com.project.fintrack2.auth;

import com.project.fintrack2.user.model.User;
import org.springframework.security.core.Authentication;

public interface AuthenticationContract {
    Authentication getAuthentication();
    User getAuthenticatedUser();
}

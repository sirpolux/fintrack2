package com.project.fintrack2.auth;

import com.project.fintrack2.constants.ErrorCodes;
import com.project.fintrack2.exception.CustomRuntimeException;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.user.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.UUID;


@AllArgsConstructor
@Component
public class SpringAuthentication implements AuthenticationContract{

    UserRepository userRepository;
    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @Override
    public User getAuthenticatedUser() {
        Authentication authentication = getAuthentication();
        if (authentication instanceof AnonymousAuthenticationToken) {
            throw new CustomRuntimeException(HttpStatus.FORBIDDEN, "Unauthorized", ErrorCodes.BAD_REQUEST_ERROR);
        }
        String currentUser = authentication.getName();
        System.out.println(currentUser);
        User user = userRepository.findByEmail(currentUser);
        return user;
    }
}

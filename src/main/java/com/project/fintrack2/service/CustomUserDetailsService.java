package com.project.fintrack2.service;


import com.project.fintrack2.exception.EmailNotFoundException;
import com.project.fintrack2.user.model.User;
import com.project.fintrack2.user.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.project.fintrack2.user.model.CustomUserPrincipal;

import java.nio.file.attribute.UserPrincipal;


@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if(user==null){
            throw new EmailNotFoundException("Email not found");
        }

        return new CustomUserPrincipal(user);
    }
}

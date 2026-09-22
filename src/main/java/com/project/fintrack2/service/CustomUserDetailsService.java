package com.project.fintrack2.service;


import com.project.fintrack2.exception.EmailNotFoundException;
import com.project.fintrack2.user.model.Users;
import com.project.fintrack2.user.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.project.fintrack2.user.model.CustomUserPrincipal;


@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByEmail(username);
        if(user==null){
            throw new EmailNotFoundException("Email not found");
        }

        return new CustomUserPrincipal(user);
    }
}

package com.project.fintrack2.service;


import com.project.fintrack2.auth.dto.LoginDto;
import com.project.fintrack2.exception.InvalidLoginCredentialsException;
import com.project.fintrack2.user.model.Users;
import com.project.fintrack2.user.repo.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthUserService {

    private final  JWTService jwtService;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;

    public String verify(LoginDto request){
        Authentication authentication= authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        if(authentication.isAuthenticated()){
           return jwtService.generateToken(request.getEmail());
        }
        else {
            throw new InvalidLoginCredentialsException("Invalid email address or password");
        }



    }
}

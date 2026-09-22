package com.project.fintrack2.auth;


import com.project.fintrack2.auth.dto.LoginDto;
import com.project.fintrack2.service.AuthUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthUserService authUserService;

    @PostMapping("/login")
    public Map<String, String> verify(@RequestBody @Valid LoginDto loginDto){
        return authUserService.verify(loginDto);
    }
}

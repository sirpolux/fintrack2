package com.project.fintrack2.auth;


import com.project.fintrack2.auth.dto.LoginDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final
    public ResponseEntity<String> verify(@RequestBody @Valid LoginDto loginDto){

    }
}

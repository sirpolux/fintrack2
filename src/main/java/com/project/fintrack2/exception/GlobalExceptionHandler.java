package com.project.fintrack2.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException err){
        Map<String, String> error = new HashMap<>();
        err.getBindingResult()
                .getFieldErrors()
                .forEach(e->{
                    error.put(e.getField(), e.getDefaultMessage());
                });
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(PasswordAndConfirmPasswordDoNotMatchException.class)
    public ResponseEntity<String> handlePasswordAndConfirmPasswordDoNotMatchException(PasswordAndConfirmPasswordDoNotMatchException err){
        return ResponseEntity.badRequest().body(err.getMessage());
    }
    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<String> handleEmailAlreadyExistsException(EmailAlreadyExistsException err){
        return ResponseEntity.badRequest().body(err.getMessage());
    }

    @ExceptionHandler(InvalidLoginCredentialsException.class)
    public ResponseEntity<String> handlesInvalidLoginCredentialsException(String message){
        return ResponseEntity.badRequest().body(message);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException err ){

    }
}

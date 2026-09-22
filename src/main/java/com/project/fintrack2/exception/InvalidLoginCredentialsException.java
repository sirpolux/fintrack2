package com.project.fintrack2.exception;

public class InvalidLoginCredentialsException extends RuntimeException {
    public InvalidLoginCredentialsException(String message){
        super(message);
    }
}

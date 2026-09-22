package com.project.fintrack2.exception;

public class PasswordAndConfirmPasswordDoNotMatchException extends RuntimeException{

    public PasswordAndConfirmPasswordDoNotMatchException(String message){
        super(message);
    }
}

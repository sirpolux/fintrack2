package com.project.fintrack2.exception;

public class DuplicateAccountType extends RuntimeException {
    public DuplicateAccountType(String message) {
        super(message);
    }
}

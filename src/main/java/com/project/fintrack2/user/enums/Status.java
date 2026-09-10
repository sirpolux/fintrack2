package com.project.fintrack2.user.enums;

public enum Status {
    ACTIVE("This is an active account"), SUSPENDED, CLOSED("This account has been suspended");

    String message="Default message";

    Status(String msg){
        this.message=msg;
    }

    Status(){

    }

    public String getMessage(){
        return this.message;
    }
}

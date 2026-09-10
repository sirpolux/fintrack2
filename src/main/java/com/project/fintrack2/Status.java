package com.project.fintrack2;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE("Active"), SUSPENDED("Suspended"), DELETED("Deleted");

    String name;

    Status(){

    }
    Status(String name){
        this.name=name;
    }

}

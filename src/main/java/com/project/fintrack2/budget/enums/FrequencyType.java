package com.project.fintrack2.budget.enums;

public enum FrequencyType {
    ONE_TIME, CUSTOM, SYSTEM;

    String info;

    FrequencyType(String info){
        this.info=info;
    }
    FrequencyType(){}
}

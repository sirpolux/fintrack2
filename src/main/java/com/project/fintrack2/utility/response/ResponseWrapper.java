package com.project.fintrack2.utility.response;


import org.springframework.http.HttpStatus;

import java.time.Instant;
import java.util.List;


public class ResponseWrapper<T> {
    private boolean success;
    private List<String> messages;
    private Integer status;
    private String errorCode;
    private T data;
    private MetaData meta;
    private Instant timestamp;

    private ResponseWrapper(
            boolean success,
            List<String> messages,
            Integer status,
            String errorCode,
            T data,
            MetaData meta
    ){
            this.success = success;
            this.messages = messages;
            this.status = status;
            this.errorCode =errorCode;
            this.data = data;
            this.meta = meta;
            this.timestamp=Instant.now();

    }

    public static <T> ResponseWrapper<T> success(List<String> messages, T data, HttpStatus status){
        return new ResponseWrapper<T>(
                true,
                messages,
                HttpStatus.OK.value(),
                null,
                data,
                null
        );
    }

    public static <T>ResponseWrapper<T> success(String message, HttpStatus status){

        return new ResponseWrapper<>(
                true,
                List.of(message),
                HttpStatus.OK.value(),
                null,
                null,
                null
        );
    }

    public static <T>ResponseWrapper<T> success(
            List<String> messages,
            T data,
            MetaData meta
            ){
            return new ResponseWrapper<>(
                    true,
                    messages,
                    HttpStatus.OK.value(),
                    null,
                    data,
                    meta
            );
    }

    public static <T>ResponseWrapper<T> error(
            HttpStatus status,
            String errorCode,
            String message
    ){
        return new ResponseWrapper<>(
                false,
                List.of(message),
                status.value(),
                errorCode,
                null,
                null
        );
    }
}

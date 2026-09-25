package com.project.fintrack2.utility;

import com.project.fintrack2.exception.ResourceNotFoundException;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;


@Configuration
public class Utility {
    public static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public  Object unwrapOptional(Optional<?> entity, String entityName){
        if(entity.isEmpty()){
            throw new ResourceNotFoundException("Entity not found: "+entityName);
        }
        return entity.get();
    }

    
}

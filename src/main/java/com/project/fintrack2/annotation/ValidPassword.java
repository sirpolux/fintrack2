package com.project.fintrack2.annotation;

import com.project.fintrack2.PasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;
import java.util.Calendar;



@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Documented
public @interface ValidPassword {

    String message()
            default "Password must have have at least 8 characters, 1 uppercase, 1 lower case and 1 special character [@$%&*!]";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

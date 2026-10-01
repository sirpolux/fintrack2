package com.project.fintrack2.annotation.aspect;


import com.project.fintrack2.annotation.ActiveAccount;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.user.model.User;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor
public class ActiveAccountAspect {

    private final AuthenticationContract auth;

    @Before("@annotation(activeAccount)")
    public void checkAccountActive(ActiveAccount activeAccount){
        User user = auth.getAuthenticatedUser();

    }
}

package com.project.fintrack2.annotation.aspect;


import com.project.fintrack2.annotation.ActiveAccount;
import com.project.fintrack2.auth.AuthenticationContract;
import com.project.fintrack2.exception.AccountNotActiveException;
import com.project.fintrack2.user.enums.Status;
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
        switch (user.getStatus()){
            case ACTIVE -> {}
            case CLOSED, SUSPENDED -> {
                throw new AccountNotActiveException("You cannot perform this operation, account is: "+ user.getStatus());
            }
        }
    }
}

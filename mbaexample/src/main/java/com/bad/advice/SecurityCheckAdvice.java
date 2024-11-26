package com.bad.advice;

import com.bad.helper.SecurityManager;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SecurityCheckAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        SecurityManager securityManager = SecurityManager.getInstance();
        if (securityManager.aunthenticate()==false)
            throw new IllegalAccessException("un/pwd is not valid");
    }
}

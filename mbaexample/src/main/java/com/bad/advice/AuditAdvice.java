package com.bad.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AuditAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("John is accessing the " + target.getClass().getName() + ", " +
                method.getName() + "(" + args[0] + ")");
    }
}

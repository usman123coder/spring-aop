package com.ta.advice;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggingAdvice implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e){
        System.out.println("This is in throws advice class method");
        System.out.println("Exception has been throw with message : " + e.getMessage());
    }
}

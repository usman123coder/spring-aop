package com.ara.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class PromotionsAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        double amt = (double) returnValue;
        if (amt>=10000)
            System.out.println("Congratulations! u earn 20% discount on ur purchase. here is the coupon : c10123");
        else
            if (amt>=7000 && amt<10000)
                System.out.println("Congratulations! u earn 12% discount on ur purchase. here is the coupon : c10123");
            else
                if (amt>=5000 && amt<7000)
                    System.out.println("Congratulations! u earn 100% discount on ur purchase. here is the coupon : c10123");
                else System.out.println("Sorry! Try Again");
    }
}

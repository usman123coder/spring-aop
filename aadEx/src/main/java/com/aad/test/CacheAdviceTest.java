package com.aad.test;

import com.aad.advice.CacheAdvice;
import com.aad.beans.Calculator;
import org.springframework.aop.framework.ProxyFactory;

public class CacheAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Calculator());
        pf.addAdvice(new CacheAdvice());

        Calculator proxy = (Calculator) pf.getProxy();
        int sum = proxy.add(100,200);
        System.out.println("Sum : " + sum);

        sum = proxy.add(100,200);
        System.out.println("Sum2 : " + sum);

        sum = proxy.add(100,200);
        System.out.println("Sum3 : " + sum);
    }
}

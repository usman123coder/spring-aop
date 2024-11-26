package com.aad.test;

import com.aad.advice.LoggingAdvice;
import com.aad.beans.Calculator;
import org.springframework.aop.framework.ProxyFactory;

public class AADTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Calculator());
        pf.addAdvice(new LoggingAdvice());

        Calculator proxy = (Calculator) pf.getProxy();
        int res = proxy.add(100,200);
        System.out.println("Sum is " + res);
    }
}

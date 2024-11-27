package com.ta.test;

import com.ta.advice.ExceptionLoggingAdvice;
import com.ta.beans.Thrower;
import org.springframework.aop.framework.ProxyFactory;

public class ThrowsAdviceTest {
    public static void main(String[] args) throws IllegalAccessException {
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new ExceptionLoggingAdvice());
        pf.setTarget(new Thrower());

        Thrower proxy = (Thrower) pf.getProxy();
        proxy.willThrow(-200);

    }
}

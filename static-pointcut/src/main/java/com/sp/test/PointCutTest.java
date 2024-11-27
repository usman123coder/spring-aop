package com.sp.test;

import com.sp.advice.LoggingAdvice;
import com.sp.beans.Calculator;
import com.sp.pointcut.LoggingPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class PointCutTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Calculator());
        pf.addAdvisor(new DefaultPointcutAdvisor(new LoggingPointcut(), new LoggingAdvice()));

        Calculator proxy = (Calculator) pf.getProxy();

        int sum = proxy.add(100,200);
        System.out.println("sum is : " + sum);
    }
}

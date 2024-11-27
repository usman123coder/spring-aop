package com.dp.test;

import com.dp.advice.LoggingAdvice;
import com.dp.beans.Calculator;
import com.dp.pointcut.DynamicPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class DynamicTestPointCutTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new Calculator());
        pf.addAdvisor(new DefaultPointcutAdvisor(new DynamicPointcut(),new LoggingAdvice()));
        Calculator proxy = (Calculator) pf.getProxy();
        int sum = proxy.add(200,404);
        System.out.println("sum is : " + sum);
    }
}

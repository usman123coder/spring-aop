package com.ara.test;

import com.ara.advice.PromotionsAdvice;
import com.ara.beans.BillManager;
import org.springframework.aop.framework.ProxyFactory;

import java.util.Arrays;

public class AfterReturningAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new BillManager());
        pf.addAdvice(new PromotionsAdvice());

        BillManager proxy = (BillManager) pf.getProxy();
        double amt = proxy.generateBill(Arrays.asList(new String[]{"p101, p102"}));
        System.out.println("bill amount : " + amt);
    }
}

package com.mba.test;

import com.mba.advice.AuditAdvice;
import com.mba.beans.LoanManager;
import org.springframework.aop.framework.ProxyFactory;

public class AuditAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new LoanManager());
        pf.addAdvice(new AuditAdvice());

        LoanManager proxy = (LoanManager) pf.getProxy();

        boolean approvedLoad = proxy.approveLoan("SBI101");
        System.out.println("Loan Approved : " + approvedLoad);
    }
}

package com.bad.test;

import com.bad.advice.AuditAdvice;
import com.bad.beans.LoanManager;
import org.springframework.aop.framework.ProxyFactory;

public class BeforeAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new LoanManager());
        pf.addAdvice(new AuditAdvice());

        LoanManager proxy = (LoanManager) pf.getProxy();
        boolean approvedLoan = proxy.approveLoan("L101");

        System.out.println("Loan approved " + approvedLoan);
    }
}

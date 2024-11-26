package com.bad.test;

import com.bad.advice.SecurityCheckAdvice;
import com.bad.beans.LoanManager;
import com.bad.helper.SecurityManager;
import org.springframework.aop.framework.ProxyFactory;

public class SecurityCheckAdviceTest {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(new LoanManager());
        pf.addAdvice(new SecurityCheckAdvice());

        LoanManager proxy = (LoanManager) pf.getProxy();
        SecurityManager securityManager = SecurityManager.getInstance();
        securityManager.logIn("John","aop@2");
        boolean status = proxy.approveLoan("L101");
        securityManager.logOut();
        System.out.println("Approved Load : " + status);
    }
}

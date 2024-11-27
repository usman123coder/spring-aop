package com.dp.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class LoggingAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Object[] args = invocation.getArguments();
        StringBuilder builder = new StringBuilder();
        builder.append("entered into " + method.getName() + "(");
        for (int i=0; i<args.length; i++){
            if (i==0){
                builder.append(args[i]);
                continue;
            }
            builder.append(", " + args[i]);
        }
        builder.append(")");
        System.out.println(builder.toString());
        Object ret = invocation.proceed();
        ret = (int) ret + 100;
        System.out.println("existing from " + method.getName() + " with retrun value " + ret);
        return ret;
    }
}

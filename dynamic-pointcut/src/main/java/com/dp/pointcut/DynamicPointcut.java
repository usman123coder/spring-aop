package com.dp.pointcut;

import com.dp.beans.Calculator;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class DynamicPointcut extends DynamicMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        System.out.println("dynamic pointcut matches()");
        if (targetClass.isAssignableFrom(Calculator.class) && method.getName().equals("add")
        && (Integer) args[0]>=100 && (Integer) args[1]<=1000)
            return true;
        return false;
    }
}

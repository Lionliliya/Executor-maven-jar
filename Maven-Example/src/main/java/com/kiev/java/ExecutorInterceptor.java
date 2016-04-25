package com.kiev.java;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ExecutorInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("ExecutorInterceptor. Before execution of " + invocation.getMethod().getName());
        Object result = invocation.proceed();
        System.out.println("ExecutorInterceptor. After execution of " + invocation.getMethod().getName());
        return result;
    }
}

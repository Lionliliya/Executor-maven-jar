package com.kiev.java;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {


    /**@Around("execution( * Executor.execute(..))")
    public void onExecute(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LogAspect. Before execution of " + joinPoint.getSignature().getName());
        joinPoint.proceed();
        System.out.println("LogAspect. After execution of " + joinPoint.getSignature().getName());

    }**/

    @Before("execution( * Executor.addTask(Task)) && args(task)")
    public void onExecute(Task task) throws Throwable {

        System.out.println(task.toString());

    }
}

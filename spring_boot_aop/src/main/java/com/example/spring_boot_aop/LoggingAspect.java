package com.example.spring_boot_aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* com.example.spring_boot_aop.*.*(..))")
    public void serviceMethods() {
    }
    @Before("serviceMethods()")
    public void logBefore(JoinPoint joinPoint)
    {
        System.out.println("[AOP Log] Method Called: " + joinPoint.getSignature().getName());
    }
}

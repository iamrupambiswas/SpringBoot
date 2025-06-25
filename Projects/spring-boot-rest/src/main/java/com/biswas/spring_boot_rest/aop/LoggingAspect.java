package com.biswas.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type, class-name.method-name(args)

    @Before("execution(* com.biswas.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    @After("execution(* com.biswas.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCallExecuted(JoinPoint jp){
        LOGGER.info("Method executed " + jp.getSignature().getName());
    }

    // Executes only when there is an exception
    @AfterThrowing("execution(* com.biswas.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCrashed(JoinPoint jp){
        LOGGER.info("Method crashed " + jp.getSignature().getName());
    }

    // Executes only when there is no exception
    @AfterReturning("execution(* com.biswas.spring_boot_rest.service.JobService.*(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method executed successfully " + jp.getSignature().getName());
    }

}

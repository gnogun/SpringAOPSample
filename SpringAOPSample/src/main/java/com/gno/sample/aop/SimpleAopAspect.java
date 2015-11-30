package com.gno.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SimpleAopAspect {

	@Before("execution(* com.gno.sample.dao.CalcDAO.*(..)) ")
	public void before(JoinPoint joinPoint) {
		System.out.println("before!");
	}

	@After("execution(* com.gno.sample.dao.CalcDAO.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("after!");
	}
}
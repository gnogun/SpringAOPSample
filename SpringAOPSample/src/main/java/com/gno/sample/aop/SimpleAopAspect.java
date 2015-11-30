package com.gno.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SimpleAopAspect {

	@Before("execution(* com.gno.sample.dao.CalcDAO.*(..)) ")
	public void before(JoinPoint joinPoint) {
		System.out.println("before!");
		Signature signature = joinPoint.getSignature();
		Object target = joinPoint.getTarget();
		Object[] args = joinPoint.getArgs();

		System.out.println("Signature : " + signature.toString());
		System.out.println("target : " + target.toString());
		System.out.println("name : " + signature.getName());
		System.out.println("longName : " + signature.toLongString());
		System.out.println("shortName : " + signature.toShortString());
	}

	@After("execution(* com.gno.sample.dao.CalcDAO.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("after!");
		Signature signature = joinPoint.getSignature();
		Object target = joinPoint.getTarget();
		Object[] args = joinPoint.getArgs();

		System.out.println("Signature : " + signature.toString());
		System.out.println("target : " + target.toString());
		System.out.println("name : " + signature.getName());
		System.out.println("longName : " + signature.toLongString());
		System.out.println("shortName : " + signature.toShortString());
	}
}
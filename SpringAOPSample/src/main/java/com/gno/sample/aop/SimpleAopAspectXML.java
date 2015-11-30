package com.gno.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class SimpleAopAspectXML {

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
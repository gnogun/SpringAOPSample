package com.gno.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class SimpleAopAspectXML {

	public void before(JoinPoint joinPoint) {
		System.out.println("before!");
	}

	public void after(JoinPoint joinPoint) {
		System.out.println("after!");
	}
}
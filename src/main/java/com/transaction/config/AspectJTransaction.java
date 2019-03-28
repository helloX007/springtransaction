//package com.transaction.config;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//
//@Aspect
//public class AspectJTransaction {
//
//	@Before(value = "execution(* *..service.*.*(..))")
//	public void before(){
//		System.out.println("前置通知");
//	}
//	
//	@After(value = "execution(* *..service.*.*(..))")
//	public void after(){
//		System.out.println("后置通知");
//	}
//	
//	@Around(value = "execution(* com.transaction.service.IStockProcessService.buyStock())")
//	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//		System.out.println("环通知前");
//		proceedingJoinPoint.proceed();
//		System.out.println("环通知前");
//	}
//}

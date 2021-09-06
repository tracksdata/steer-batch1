package com.xoriant.product.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspects {
	
	@Before("execution(void *save*())")
	public void f1(JoinPoint jp) {
		System.out.println("---- before save method of "+jp.getSignature());
	}
	
	@After("execution(void *save*())")
	public void f2(JoinPoint jp) {
		System.out.println("---- aftter save method of "+jp.getSignature());
	}
	
	@AfterReturning("execution(int *save*())")
	public void f3(JoinPoint jp) {
		System.out.println("========== after return save method of "+jp.getSignature());
	}
	
	@AfterThrowing("execution(void *save*())")
	public void f4(JoinPoint jp) {
		System.out.println("==========  save method thrown exception at of "+jp.getSignature());
	}
	
	@Around("execution(void *saveProduct())")
	public void f5(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("########### around method of "+pj.getSignature());
		
		//before invocation of saveProduct
		pj.proceed();
		
		// after invocation of saveProduct
		
		
	}
	
	
	@AfterThrowing("execution(boolean *transferFunds(..))")
	public void f44(JoinPoint jp) {
		System.out.println("==========  after throwing exception of  "+jp.getSignature());
	}
	
	
	@Around("execution(boolean *transferFunds(..))")
	public Object f6(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("########### around method of "+pj.getSignature());
		
		//before invocation of saveProduct
		Object status=pj.proceed(); // if procedd method not called, then transfer is not successfull
		// after invocation of saveProduct
		System.out.println(">>>> STSTUS:::: "+status);
		// 
		return status;
		
		
	}
	
	
	
	
	
	
	
	

}

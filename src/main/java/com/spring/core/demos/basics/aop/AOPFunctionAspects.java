package com.spring.core.demos.basics.aop;

import java.util.Arrays;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("aopfunctionsaspects")
public class AOPFunctionAspects {

	
	
	@Pointcut("execution(* com.spring.core.demos.basics.aop.AOPFunctions.doSum())")
	private void doSumPointCut() {
		
	}
	
	
	
	
	@Before("doSumPointCut()")
	public void adviceForSum( ) {

 		
		System.out.println("calling sum - BEFORE");
 		//joinPoint.proceed();
 		
 
	}
	
	
	/*@Before("execution(* com.spring.core.demos.basics.aop.AOPFunctions.doSum())")
	public void dd( ) {

		System.out.println("logAround() is running!");
		
		
		System.out.println("Around before is running!");
		//joinPoint.proceed();
		System.out.println("Around after is running!");
		
		System.out.println("******");

	}*/
	
	public void afterDOSum() {
		System.out.println("after do sum");
	}
	
	public void beforeDOMul() {
		System.out.println("before do mul");
	}
	
	public void afterDOMul() {
		System.out.println("after do mul");
	}
}

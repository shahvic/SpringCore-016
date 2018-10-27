package com.spring.core.demos.basics.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTester {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("application_beans.xml");
		AOPFunctions aopFunctions = (AOPFunctions) app.getBean("aopfunctions");
		aopFunctions.doSum();
		
		
	}

}

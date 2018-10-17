package com.spring.core.demos.basics.di.autowiring.require;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequireBeanTest {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
       StudentBean studentBean = (StudentBean) context.getBean("studentrequirebean");
       System.out.println(studentBean.getDepartBean());
	}
}

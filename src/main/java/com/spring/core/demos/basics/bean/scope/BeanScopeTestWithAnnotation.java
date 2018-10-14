package com.spring.core.demos.basics.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.core.demos.basics.bean.annotations.Employee;

public class BeanScopeTestWithAnnotation {

	
	public static void main(String[] args) {
		 AbstractApplicationContext context= new AnnotationConfigApplicationContext(StudentBean.class);
		 
		 StudentBean studentBean = (StudentBean) context.getBean("studentbeanref");
		 System.out.println(studentBean);
		 
		 StudentBean studentBean1 = (StudentBean) context.getBean("studentbeanref");
		
		 System.out.println(studentBean1);
		 
		 context.registerShutdownHook();
		 
		 System.out.println("bean has been disposed");

	}
}

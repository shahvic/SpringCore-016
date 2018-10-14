package com.spring.core.demos.basics.bean.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanWithAnnotationDemo {

	
	public static void main(String[] args) {
		 ApplicationContext context= new AnnotationConfigApplicationContext(Employee.class);
		//ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		 
		Employee emp = (Employee) context.getBean("employee1");
		Organization org = (Organization) context.getBean("orgobj");
		emp.doEmpTask();
		org.doOrgTask();

	}
}

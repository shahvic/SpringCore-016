package com.spring.core.demos.basics.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
	
	public static void main(String[] args) {
 		/*
		 * setter method DI
		 * 
		 * Student student = new Student();
		Department department = new Department();
		student.setDepartment(department);
		student.doStudentTask();*/
		
		/*constructor - based DI
		Department department = new Department();
		Student student = new Student(department);
		student.doStudentTask();*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		Student student = (Student)context.getBean("student");
		student.doStudentTask();
	}

}

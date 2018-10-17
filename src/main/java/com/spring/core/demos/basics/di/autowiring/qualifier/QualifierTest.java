package com.spring.core.demos.basics.di.autowiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierTest {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		AnimalDepnedent animalDepnedent = (AnimalDepnedent) context.getBean("animalDepnedentobj");

	}
}

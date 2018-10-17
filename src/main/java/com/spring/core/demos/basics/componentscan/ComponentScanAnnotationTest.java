package com.spring.core.demos.basics.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanAnnotationTest {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
 	}

}

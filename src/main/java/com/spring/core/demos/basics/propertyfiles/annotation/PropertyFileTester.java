package com.spring.core.demos.basics.propertyfiles.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyFileTester {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfigReader.class);
		DBConfigReader dbConfigReader = (DBConfigReader) context.getBean("dbconfigwithannotation");
		System.out.println(dbConfigReader.getDbHost());
		
	}

}

package com.spring.core.demos.basics.propertyfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProprtyFileTester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		DBConfig dbConfig = (DBConfig) context.getBean("mydbconfig");
		System.out.println(dbConfig.getDbuser());
		System.out.println(dbConfig.getHost());
		System.out.println(dbConfig.getPort());
	}

}

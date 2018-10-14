package com.spring.core.demos.basics;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringAppTest {
	static	Logger logger = Logger.getLogger(SpringAppTest.class);
 	public static void main(String[] args) {
		//XmlBeanFactory beanFactory = new XmlBeanFactory((Resource) new ClassPathXmlApplicationContext(""));
	
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		/*Student student=  (Student)context.getBean("student1");
		
		System.out.println(student.getName());
		System.out.println(student.getRoll());*/
		
		
Student st2=  (Student)context.getBean("student2");
		
		System.out.println(st2.getName());
		System.out.println(st2.getRoll());
		
		// destroy context
		((AbstractApplicationContext) context).registerShutdownHook();

Student st3=  (Student)context.getBean("student3");
		
		System.out.println(st3.getName());
		System.out.println(st3.getRoll());
		
		logger.trace("Hello I have been logged with trace");
		logger.info("i have been logged with info");
		logger.error("i hav ebeen logged with error");
		
 		
		
	
	}
}

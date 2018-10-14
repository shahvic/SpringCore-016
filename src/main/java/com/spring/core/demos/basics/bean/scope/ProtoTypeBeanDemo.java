package com.spring.core.demos.basics.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoTypeBeanDemo {

	// singleton,prototype,request,global-session
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		
		PrototypeSpringBean prototypeSpringBean =  (PrototypeSpringBean)context.getBean("prototypebean");
	System.out.println(prototypeSpringBean);
	prototypeSpringBean.prototypeTask();	
	

	
	PrototypeSpringBean prototypeSpringBean1 =  (PrototypeSpringBean)context.getBean("prototypebean");
	System.out.println(prototypeSpringBean1);
	prototypeSpringBean1.prototypeTask();
	
	}



}

package com.spring.core.demos.basics.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	// singleton,prototype,request,global-session
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		
	ScopeBean scopeBean =  (ScopeBean)context.getBean("scopebean");
	System.out.println(scopeBean);
	scopeBean.scopeBeantask();
	
	ScopeBean scopeBean1 =  (ScopeBean)context.getBean("scopebean");
	System.out.println(scopeBean1);
	scopeBean1.scopeBeantask();
	}

}

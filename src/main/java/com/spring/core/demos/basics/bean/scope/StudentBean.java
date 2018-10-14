package com.spring.core.demos.basics.bean.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentBean implements InitializingBean , DisposableBean {

	
	@Bean
	//@Scope("prototype")
	public StudentBean studentbeanref() {
		return new StudentBean();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("bean initialized");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("destroying the bean object   ");
		
	}
}

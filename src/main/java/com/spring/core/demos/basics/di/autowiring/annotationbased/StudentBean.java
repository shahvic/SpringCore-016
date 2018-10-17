package com.spring.core.demos.basics.di.autowiring.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class StudentBean {
	
	@Autowired(required=true)
	private DepartBeanTest departBean;

	public DepartBeanTest getDepartBean() {
		return departBean;
	}

 
}

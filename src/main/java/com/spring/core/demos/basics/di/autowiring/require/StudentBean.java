package com.spring.core.demos.basics.di.autowiring.require;

import org.springframework.beans.factory.annotation.Required;

public class StudentBean {
	
	private DepartBeanTest departBean;

	public DepartBeanTest getDepartBean() {
		return departBean;
	}

	@Required
	public void setDepartBean(DepartBeanTest departBean) {
		this.departBean = departBean;
	}

}

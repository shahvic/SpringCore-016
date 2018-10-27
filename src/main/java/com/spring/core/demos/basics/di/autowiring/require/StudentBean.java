package com.spring.core.demos.basics.di.autowiring.require;

import org.springframework.beans.factory.annotation.Required;

public class StudentBean {
	
	private DepartmentBean departBean;

	public DepartmentBean getDepartBean() {
		return departBean;
	}

	@Required
	public void setDepartBean(DepartmentBean departBean) {
		this.departBean = departBean;
	}

}

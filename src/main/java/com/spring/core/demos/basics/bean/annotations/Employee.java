package com.spring.core.demos.basics.bean.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {
	
	public Employee() {}
	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	@Bean(name="employee1")
	public Employee employee1() {
		return new Employee();
	}
	
	@Bean
	public Organization orgobj() {
		return new Organization();
	}
	
	int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void doEmpTask() {
		
		System.out.println("doing employee task!!!!!");
	}
	
}

package com.spring.core.demos.basics.di;

public class Student {
	
	String studentName;
	
    public Department getDepartment() {
		return departmentObj;
	}

	/*public void setDepartment(Department departmentObj) {
		this.departmentObj = departmentObj;
	}
*/
	Department departmentObj ;
	
	public void doStudentTask() {
		System.out.println("Student task Initiated!!!");
	//	Department department = new Department();
		//department.doingsomething
		//this.department
		System.out.println("Student task Ended!!!");
		
	}

	public Student(Department departmentObj) {
		super();
		this.departmentObj = departmentObj;
	}

}

package com.spring.core.demos.basics;

public class Student {
	

	


	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	private int roll;
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}



	

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void myInit() {
		System.out.println("Init - Called");
	}
	
	public void myDestroy() {
		System.out.println("destroying");
	}
}

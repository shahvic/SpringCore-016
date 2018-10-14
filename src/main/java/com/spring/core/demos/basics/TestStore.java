package com.spring.core.demos.basics;

public class TestStore {
	
	public static void main(String[] args) {
		Item item = new Item("",10);
		Store st = new Store(item);
		int result=st.doSomeTask();
		if(result==1)
			System.out.println("PASS");
		else
			System.out.println("FAILED");
		
	}

}

package com.spring.core.demos.basics;

public class Store {
	
	Item item ;
	
	public Store(Item item) {
		
		// some other class object
		//item= new Item("Drink", 20);
		
		this.item= item;
	}

	public int doSomeTask() {
		
		System.out.println("Current Item name is:"+item.itemName);
		
		return 1;
		
	}
	
}


class Item{
	
	public Item(String itemName, int itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	String itemName;
	int itemPrice;
	
	
	
}

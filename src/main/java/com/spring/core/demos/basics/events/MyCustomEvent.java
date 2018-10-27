package com.spring.core.demos.basics.events;

import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent{
String object;

	public MyCustomEvent(String source) {
		super(source);
		this.object=source;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyCustomEvent"+object;
	}

}

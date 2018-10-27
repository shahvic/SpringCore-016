package com.spring.core.demos.basics.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTester {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		MyEventPublisher myEventPublisher = (MyEventPublisher) context.getBean("mypublisher");
		System.out.println(myEventPublisher);
		MyCustomEvent myCustomEvent = new MyCustomEvent("Test Event");
		myEventPublisher.publishMyEvent(myCustomEvent);
		myEventPublisher.publishMyEvent(new MyCustomEvent("1"));
		myEventPublisher.publishMyEvent(new MyCustomEvent("2"));
		myEventPublisher.publishMyEvent(new MyCustomEvent("3"));
	}

}

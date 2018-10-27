package com.spring.core.demos.basics.events;

import java.nio.channels.ShutdownChannelGroupException;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyCustomEvent>{
//ContextRefreshedEvent,ContextStoppedEvent
	@Override
	public void onApplicationEvent(MyCustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Event has been triggerred: EVENT: "+event);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

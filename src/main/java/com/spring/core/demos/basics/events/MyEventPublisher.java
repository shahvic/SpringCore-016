package com.spring.core.demos.basics.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component("mypublisher")
public class MyEventPublisher implements ApplicationEventPublisherAware{

	ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher=applicationEventPublisher;
		//
	}
	
	public void publishMyEvent(MyCustomEvent myCustomEvent) {
		
		
		System.out.println("gonna publish event"+myCustomEvent.object);
		applicationEventPublisher.publishEvent(myCustomEvent);
		System.out.println("event has been published");
		
	}

}

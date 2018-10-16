package com.spring.core.demos.basics.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
		
		CollectionBean collectionBean = (CollectionBean) context.getBean("collectionBean");
		
		System.out.println("collectionBeanName :"+collectionBean.getCollectionBeanName());
		System.out.println("collectionBeanList :"+collectionBean.getCollectionBeanList());
		System.out.println("collectionBeanSet :"+collectionBean.getCollectionBeanSet());
		System.out.println("collectionBeanMap :"+collectionBean.getCollectionBeanMap());

	}

}

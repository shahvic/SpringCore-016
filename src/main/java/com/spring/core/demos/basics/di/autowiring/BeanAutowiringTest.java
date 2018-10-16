package com.spring.core.demos.basics.di.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutowiringTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("application_beans.xml");
	Animal animal = (Animal) context.getBean("animalObj");
	System.out.println(animal.getGrass());
	System.out.println(animal.getGrass().getGrassName());
	
	
	Animal animal2 = (Animal) context.getBean("animalObj2");
	System.out.println(animal2.getGrass());
	System.out.println(animal2.getGrass().getGrassName());
	
	
	AnimalWithConsructor animalWithConsructor = (AnimalWithConsructor) context.getBean("animalWithConst");
	System.out.println("constructor based:::"+animalWithConsructor.getGrass().getGrassName());
}
}

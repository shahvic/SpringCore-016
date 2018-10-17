package com.spring.core.demos.basics.di.autowiring.qualifier;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnimalDepnedent {
	
//	@Inject
	@Autowired
	//@Qualifier("animalcat")
	Animal animal;

}

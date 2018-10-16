package com.spring.core.demos.basics.di.autowiring;

public class AnimalWithConsructor {
	
	private Grass grass;

	public AnimalWithConsructor(Grass grass) {
		super();
		this.grass = grass;
	}

	public Grass getGrass() {
		return grass;
	}
	
	

}

package com.spring.core.demos.basics.di.autowiring;

public class Animal {
	
	private String animalName;
	private Grass grass;
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public Grass getGrass() {
		return grass;
	}
	public void setGrass(Grass grass) {
		this.grass = grass;
	}

}

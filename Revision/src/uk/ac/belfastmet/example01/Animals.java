package uk.ac.belfastmet.example01;

import java.util.ArrayList;

public class Animals {
	
	private ArrayList<Dog> dogAnimals;
	private ArrayList<Cat> catAnimals;
	private ArrayList<Giraffe> giraffeAnimals;
	
	public ArrayList<Dog> getdogAnimals() {
		
		this.dogAnimals = new ArrayList<Dog>();
		
		this.dogAnimals.add(new Dog("rover", "collie", 5, "black"));
		
		return this.dogAnimals;
	}
	
	public ArrayList<Cat> getcatAnimals() {
		
		this.catAnimals = new ArrayList<Cat>();
		
		this.catAnimals.add(new Cat("molly", "british shorthair", 6, "black"));
		
		return this.catAnimals;
	}

	public ArrayList<Giraffe> getgiraffeAnimals() {
	
	this.giraffeAnimals = new ArrayList<Giraffe>();
	
	this.giraffeAnimals.add(new Giraffe("rodney", "west african", 10, "mixed"));
	
	return this.giraffeAnimals;
	}
	
	public static void main(String[] args) {
		
		System.out.println();
		
	}	
	
	public void bark() {
		
	}
	
	public String fetch() {
		return "fetch";
	}	

}


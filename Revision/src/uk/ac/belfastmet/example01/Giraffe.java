package uk.ac.belfastmet.example01;

public class Giraffe {
	
	private String name;
	private String breed;
	private int age;
	private String colour;
	
	public Giraffe() {
		
	}
	
	public Giraffe(String name, String breed, int age, String colour) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	

}

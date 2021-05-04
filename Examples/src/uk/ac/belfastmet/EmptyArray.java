package uk.ac.belfastmet;

import java.util.ArrayList;

public class EmptyArray {
	
	public static void main(String[] args) {
		EmptyArray emptyArray = new EmptyArray();
		emptyArray.emptyArray();
		
	}
	
	/**
	 * Javadoc needed
	 */
	public void emptyArray() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		
		listOfStuff.remove("Good");
		
		System.out.println("Size of Array: " + listOfStuff.size());
		
		
				
		
		}

}

package uk.ac.belfastmet;

import java.util.ArrayList;

public class ContainsString {

	public static void main(String[] args) {
		ContainsString containsString = new ContainsString();
		containsString.containsString();
		
	}
	
	/**
	 * javadoc needed
	 */
	public void containsString() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		
		System.out.println(listOfStuff.contains("Good"));
		System.out.println("This is a new sentence");
		}
		
	}



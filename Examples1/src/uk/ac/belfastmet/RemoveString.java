package uk.ac.belfastmet;

import java.util.ArrayList;

public class RemoveString {

	public static void main(String[] args) {
		RemoveString removeString = new RemoveString();
		removeString.removeString();
		
	}
	
	
	public void removeString() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		
		listOfStuff.remove("Good");
		
		System.out.println("Size of Array: " + listOfStuff.size());
		
		
				
	
		}

}

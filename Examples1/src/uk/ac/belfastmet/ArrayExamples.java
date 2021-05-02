package uk.ac.belfastmet;

import java.util.ArrayList;

public class ArrayExamples {

	public static void main(String[] args) {
		ArrayExamples arrayExamples = new ArrayExamples();
		arrayExamples.addStringToArrayList();
		
	//minor thing but keep white space to a minimum to keep code tidy	
	}
	
	/**
	 * Explain what method is doing
	 */
	public void addStringToArrayList() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		
		for(int index = 0; index < listOfStuff.size(); index++) {
			String indexValue = listOfStuff.get(index);
			System.out.println("Value of string:" + indexValue);
		}
		
	}

}

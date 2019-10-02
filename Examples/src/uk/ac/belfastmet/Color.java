package uk.ac.belfastmet;

/*Given a string, if the string begins
 *  with "red" or "blue" 
 *  return that color string, 
 *  otherwise return the empty string.
 *  
 *  seeColor("redxx") → "red"
 *  seeColor("xxred") → ""
 *  seeColor("blueTimes") → "blue" */

public class Color {
	
	public String seeColor(String word) {
		String newString = "";
		
		if(word.startsWith("red")) {
			newString = "red";
		} else if(word.startsWith("blue")) {
			newString = "blue";
		} else {
			newString = "";
		}
		
		return newString;
	}
	
	

}

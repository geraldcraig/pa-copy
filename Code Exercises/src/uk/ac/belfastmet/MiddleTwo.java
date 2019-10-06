package uk.ac.belfastmet;

/*Given a string of even length, 
 * return a string made of the middle two chars, 
 * so the string "string" yields "ri". 
 * The string length will be at least 2.
 * middleTwo("string") → "ri" 
 * middleTwo("code") → "od"
 * middleTwo("Practice") → "ct" */

public class MiddleTwo {
	
	public String middleTwo(String word) {
		String newString = "";
		if(word.length() == 2) {
			return word;
			
		}
		newString = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
		
		return newString;
	}


}

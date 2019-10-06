package uk.ac.belfastmet;

public class Middle {
	
	public String middleThree(String word) {
		String newString = "";
		
		if(word.length() < 3) {
			return word;
			
		}
		newString = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
		
		
		return newString;
		
	}
		
}

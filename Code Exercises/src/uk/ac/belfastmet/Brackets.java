package uk.ac.belfastmet;

public class Brackets {
	
	public static String balancedBrackects(String str) {
		
		String result = "Not Balanced";
		
		int openBracket = 0;
		int closedBracket = 0;
		int openSquare = 0;
		int closedSquare = 0;
		int openBrace = 0;
		int closedBrace = 0;
				
		if(str.length() % 2 == 1) {
			return result;
		}
		else {
		
		for(int index = 0; index < str.length(); index++) {
			if(str.charAt(index) == '(') {
				openBracket++;
			} else if(str.charAt(index) == ')') {
				closedBracket++;
			} else if(str.charAt(index) == '[') {
				openSquare++;
			} else if(str.charAt(index) == ']') {
				closedSquare++;
			} else if(str.charAt(index) == '{') {
				openBrace++;
			} else if(str.charAt(index) == '}') {
				closedBrace++;
			} 
			
			if(openBracket == closedBracket && openSquare == closedSquare && openBrace == closedBrace) {
				return "Balanced";
			} 
			
			return result;
				
			
		}
	}	    
	}
}
		
		 

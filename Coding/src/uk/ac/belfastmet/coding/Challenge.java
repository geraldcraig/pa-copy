package uk.ac.belfastmet.coding;

public class Challenge {
	
	 /*method to check number
	  of brace pairs*/
	  public static Integer numberOfBracePairs( String braces ) {
	   //create integers to count number of braces
	    int result = 0;
	    
	    int openParentheses = 0;
	    int closedParentheses = 0;
	    int openBrackets = 0;
	    int closedBrackets = 0;
	    int openCurlyBraces = 0;
	    int closedCurlyBraces = 0;
	    
	    
	    //loop through string to count braces
	    for(int index = 0; index < braces.length(); index++) {
	      if(braces.charAt(index)== '(') {
	        openParentheses++;
	    } else if(braces.charAt(index)== ')') {
	        closedParentheses++;
	    } else if(braces.charAt(index)== '[') {
	        openBrackets++;
	    } else if(braces.charAt(index)== ']') {
	        closedBrackets++;
	    } else if(braces.charAt(index)== '{') {
	        openCurlyBraces++;
	    } else if(braces.charAt(index)== '}') {
	        closedCurlyBraces++;
	}
	     //count the number of pairs of braces 
	     /* if statements to count number of pairs 
	     of matched braces and return either 0,
	     1, 3 or -1*/
	        
	        return result;
	}
	  }


}

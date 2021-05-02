package uk.ac.belfastmet.coding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		  
		  if (braces.length() == 0) {
			  return 0;
		  } else if (braces.length() % 2 != 0) {
			  return -1;
		  }
	    
	    
//	    //loop through string to count braces
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
//	     //count the number of pairs of braces 
//	     /* if statements to count number of pairs 
//	     of matched braces and return either 0,
//	     1, 3 or -1*/
	        
	      if((openBrackets == closedBrackets) && (openCurlyBraces == closedCurlyBraces)
	    		  && (openParentheses ==closedParentheses))  {
			    result = 1;

			    			    
	      }
	}
		return result;
}
	  
	  
	  
	  
		/*  if (braces.length() == 0) {
	  return 0;
  } else if (braces.length() % 2 != 0) {
	  return -1;
  }

  Map<String, Integer> map = new HashMap<String, Integer>();
  map.put("(", 0);
  map.put(")", 0);
  map.put("[", 0);
  map.put("]", 0);
  map.put("{", 0);
  map.put("}", 0);
  		  
//  String braceTypes = "()[]{}";
  		  
  String[] bracesArr = braces.split("");
 
  for (int i = 0; i < bracesArr.length; i++) {
	  if(map.containsKey(bracesArr[i])) map.put(bracesArr[i], map.get(bracesArr[i]) + 1);
  }
  
  if((map.get("(") == map.get(")")) && (map.get("[") == map.get("]")) && (map.get("{") == map.get("}"))) {
	  return map.get(")") + map.get("[") + map.get("}");
  }
  
  return -1;*/
  
	  }


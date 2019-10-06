package uk.ac.belfastmet;

public class Brace {
	
	/**
	 * method to count how many open brackets & how many closed brackets
	 * comparing the their values, 
	 * same value of open = Balanced
	 * @param str input
	 * @return a string, stating balanced or not 
	 */

		public static String balancedBrackets(String str) {

			String result = "Not Balanced"; 

			int openBrackets = 0; 
			int closedBrackets = 0; 
			int openCurlies = 0; 
			int closedCurlies = 0; 
			int openSquare = 0; 
			int closedSquare = 0;

			if (str.length() ==0 || str.length()%2 == 1) {

				return result;    
			}

			else {

	/**
	 * counting how many there are open brackets 
	 */

					for(int i=0; i < str.length(); i++)

				    {   if(str.charAt(i) == '[') {
				    	openSquare++;			

				    }   if(str.charAt(i) == '{') {
				    	openCurlies++;

				    }
				    	if(str.charAt(i) == '(') {
				    	openBrackets++;

				    }

	/**
	 * counting how many there are closed brackets 
	 */
				    	if(str.charAt(i) == ')') {
				    	closedBrackets++;
				    }

				    	if(str.charAt(i) == '}') {
				    	closedCurlies++;
				    }
				    	if(str.charAt(i) == ']') {
				    	closedSquare++;
				    }
			}

	//comparing open brackets to closed brackets 

				    if((openBrackets == closedBrackets) && (openCurlies == closedCurlies) && (openSquare==closedSquare))  {

				    result = "Balanced";				    
	}

	}
		return result;

	}


}

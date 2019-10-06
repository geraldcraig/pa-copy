package uk.ac.belfastmet;

public class StringContains {
	
	
	public boolean stringE(String word) {
		boolean result = false;
		
		int count = 0;
		
		for(int index = 0; index < word.length(); index++) {
			
			if(word.charAt(index) == 'e') {
				count++;
			}
			
			
			if(count >= 1 && count <= 3) {
				result = true;
			} else {
			
				result = false;
			}
		}
		

			return result;
		
	}
	
		

}

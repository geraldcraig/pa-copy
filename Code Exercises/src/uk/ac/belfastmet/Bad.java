package uk.ac.belfastmet;

/*Given a string, return true if
 * "bad" appears starting at 
 * index 0 or 1 in the string,
 * such as with "badxxx" or
 * "xbadxx" but not "xxbadxx".
 * 
 * hasBad("badxx") true
 * hasBad("xbadxx") true
 * hasBad("xxbadxx") false */


//check the string for "bad" using a substring(0, 3) to check the 1st 3 chars at the start of the string
//and substring (1,4) to check for it at index 1,2,3
//with substring you use  (1st index that you want to return, the index 1 after the last index you want to return)  
public class Bad {
	
	public boolean hasBad(String str) {
		boolean result = false;
		if(str.startsWith(str)) {
			result = true;
		} else {
			
	
		
		}
		String substr = str.substring(1,5);
		//System.out.println(str);
		System.out.println(substr);
		return result;
		
	}

}

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

package uk.ac.belfastmet.coding;

/*Given a string, return true if the string starts 
 * with "hi" and false otherwise.
 * 
 * startHi("hi there") - true
 * startHi("hi") - true
 * startHi("hello hi") - false
 */

public class Hello {
	
	public static void main(String[] args) {
		Hello hello = new Hello();
		boolean outcome1 = hello.startHi("hi there");
		boolean outcome2 = hello.startHi("hi");
		boolean outcome3 = hello.startHi("hello hi");
		
		System.out.println(outcome1);
		System.out.println(outcome2);
		System.out.println(outcome3);
		
		
	}
	
	public boolean startHi(String str) {
		if (str.length() < 2) return false;
		  
		   String firstTwo = str.substring(0, 2);
		   
		   if (firstTwo.equals("hi")) {
		     return true;
		   } else {
		     return false;
		   }
		
	}

}

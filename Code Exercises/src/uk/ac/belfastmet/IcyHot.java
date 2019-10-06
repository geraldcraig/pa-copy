package uk.ac.belfastmet;
/*Given two temperatures, return true if one is less than 0 
and the other is greater than 100.*/

public class IcyHot {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		IcyHot icyHot = new IcyHot();
		boolean outcome = icyHot.returnIcyHot(01, 100);
		boolean outcome1 = icyHot.returnIcyHot(100, -1);
		boolean outcome2 = icyHot.returnIcyHot(2, 120);
		
		if (outcome == true && outcome1 == true && outcome2 == false)
			System.out.println("It worked");
		
		System.out.println("the outcome is:" + outcome);
		System.out.println("the outcome is:" + outcome1);
		System.out.println("the outcome is:" + outcome2);
		
	}
	
	//add java doc for this method
	public boolean returnIcyHot(int temp1, int temp2) {
		boolean result;
		
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			result = true; 
			
		} else {
		
		 result = false;
		 
		}
		 return result;
	}
 
}

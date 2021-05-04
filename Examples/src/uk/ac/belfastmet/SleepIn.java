package uk.ac.belfastmet;

public class SleepIn {
	


	public static void main(String[] args) {
		SleepIn sleepin = new SleepIn();
		boolean outcome = sleepin.sleepIn (true, false);
		System.out.println("we sleepin");
		
	}
	/**
	 * Method to return true if we can sleep in.
	 * @param vacation boolean
	 * @param weekday boolean
	 * @return true or false result
	 */
	public boolean sleepIn(boolean vacation, boolean weekday) {
		
		boolean result = false;
		
		if(!weekday || vacation) {
			result = true;
			System.out.println("true");
		} else {
			result = false;
			System.out.println("false");
		}
		
				return result;
	
	}
}

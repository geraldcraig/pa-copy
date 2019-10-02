package uk.ac.belfastmet;

public class ReturnInt {
	
	public static void main (String[] args) {
		ReturnInt example02 = new ReturnInt();
		int outcome = example02.returnSomething();
		System.out.println("the outcome was: " + outcome);
		
		
	}
	
	public int returnSomething() {
		int result = 42;
		
		return result;
	}
}

package uk.ac.belfastmet;

public class ReturnMultipleInt {

	public static void main(String[] args) {
		
		
		
		ReturnMultipleInt returnMultipleInt = new ReturnMultipleInt();
		int outcome = returnMultipleInt.returnSomething();
		System.out.println("the outcome was: " + outcome);
		
		
	}
	
	public int returnSomething() {
		
		int a = 4;
		int b = 5;
		
		int result = (a * b);
		
		return result;
	}

}

package uk.ac.belfastmet;

public class ReturnString {

	public static void main(String[] args) {
		ReturnString returnString = new ReturnString();
		String outcome = returnString.returnSomething();
		System.out.println("the outcome was: " + outcome);
		
	}
	
	public String returnSomething() {
		String result = "hello world";
		
		return result;
	}

}

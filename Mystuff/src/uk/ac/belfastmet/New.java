package uk.ac.belfastmet;

public class New {
	
	public static void main(String[] args) {
		
		String name = "John Doe";
		
		int charPos = name.indexOf("D");
		
		String lastName = name.substring(charPos);
		
		System.out.println(lastName);
		
	}

}

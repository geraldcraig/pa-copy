package uk.ac.belfastmet;

public class Palindrome {
	
	public boolean isPalindrome(String str) {
		String reverse = "";
		
		
		int length = str.length();
		
		for(int i = length -1; i >= 0; i--);
		
		
		int i = 0;
		reverse = reverse + str.charAt(i);
		
		System.out.println(reverse);
		
		return true;
	}

}

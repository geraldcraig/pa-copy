package uk.ac.belfastmet.coding;

public class Palindrome {
	
	public boolean isPalindrome(String word) {
		boolean isPalindrome = true;
		for(int i = 0; i < word.length()/2-1; i++) {
			if(word.charAt(i)!=word.charAt(word.length()-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
	
	
	
	
}
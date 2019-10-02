package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testIsPalindrome() {
		Palindrome palindrome = new Palindrome();
		
		boolean result = palindrome.isPalindrome("hannah");
				
		assertEquals(true, result);
	}
	
	@Test
	public void testIsPalindrome2() {
		Palindrome palindrome = new Palindrome();
		
		boolean result = palindrome.isPalindrome("martin");
				
		assertEquals(false, result);
	}

}

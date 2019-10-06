package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Palindrome test class 
 * @author cra19171869
 *
 */
public class PalindromeTest {
	
	/**
	 * Method to test if 
	 * isPalindrome method
	 * works
	 */
	@Test
	public void testIsPalindrome() {
		Palindrome palindrome = new Palindrome();
		
		boolean result = palindrome.isPalindrome("hannah");
				
		assertEquals(true, result);
	}
	
	/**
	 * Method to test if 
	 * isPalindrome method
	 * works
	 */
	@Test
	public void testIsPalindrome2() {
		Palindrome palindrome = new Palindrome();
		
		boolean result = palindrome.isPalindrome("martin");
				
		assertEquals(false, result);
	}

}

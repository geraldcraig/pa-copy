package uk.ac.belfastmet.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeNewTest {

	@Test
	public void testIsPalindrome() {
		PalindromeNew palindromeNew = new PalindromeNew();
		boolean result = palindromeNew.isPalindrome("gerald");
		assertEquals(false, result);
	}

}

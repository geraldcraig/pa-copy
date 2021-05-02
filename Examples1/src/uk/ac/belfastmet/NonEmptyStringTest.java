package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonEmptyStringTest {

	@Test
	public void testEveryNth() {
		NonEmptyString nonEmptyString = new NonEmptyString();
		
		String result = nonEmptyString.everyNth("Miracle", 2);
		
		assertEquals("Mrce", result);
	}
	
	@Test
	public void testEveryNth2() {
		NonEmptyString nonEmptyString = new NonEmptyString();
		
		String result = nonEmptyString.everyNth("abcdefg", 2);
		
		assertEquals("aceg", result);
	}
	
	@Test
	public void testEveryNth3() {
		NonEmptyString nonEmptyString = new NonEmptyString();
		
		String result = nonEmptyString.everyNth("abcdefg", 3);
		
		assertEquals("adg", result);
	}

}

package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringContainsTest {

	@Test
	public void testStringE() {
		StringContains stringContains = new StringContains();
		
		boolean result = stringContains.stringE("Hello");
		
		
		
		assertEquals(true, result);
	}
	
	@Test
	public void testStringE1() {
		StringContains stringContains = new StringContains();
		
		boolean result = stringContains.stringE("Heelle");
		
		
		
		assertEquals(true, result);
	}
	
	@Test
	public void testStringE2() {
		StringContains stringContains = new StringContains();
		
		boolean result = stringContains.stringE("Heelele");
		
		
		
		assertEquals(false, result);
		
	}

}

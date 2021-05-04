package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class BadTest {

	@Test
	public void testHasBad() {
		Bad bad = new Bad();
		
		boolean result = bad.hasBad("badxx");
		assertEquals(true, result);
	}
	
	@Test
	public void testHasBad2() {
		Bad bad = new Bad();
		
		boolean result = bad.hasBad("xbadxx");
		assertEquals(true, result);
	}
	
	@Test
	public void testHasBad3() {
		Bad bad = new Bad();
		
		boolean result = bad.hasBad("xxbadxx");
		assertEquals(false, result);
	}

}

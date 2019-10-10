package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testConcatenate() {
		
		String result = Hello.concatenate("Hello ", "Bob!");
		
		assertEquals("Hello Bob!", result);
	}
	
	@Test
	public void testConcatenate2() {
		
		String result = Hello.concatenate("Hello ", "Alice!");
		
		assertEquals("Hello Alice!", result);
	}
	
	@Test
	public void testConcatenate3() {
		
		String result = Hello.concatenate("Hello ", "X!");
		
		assertEquals("Hello X!", result);
	}

}

package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleTwoTest {

	@Test
	public void testMiddleTwo() {
		MiddleTwo middleTwo = new MiddleTwo();
		
		String result = middleTwo.middleTwo("string");
		assertEquals("ri", result);
	}
	
	@Test
	public void testMiddleTwo2() {
		MiddleTwo middleTwo = new MiddleTwo();
		
		String result = middleTwo.middleTwo("code");
		assertEquals("od", result);

	}
	
	@Test
	public void testMiddleTwo3() {
		MiddleTwo middleTwo = new MiddleTwo();
		
		String result = middleTwo.middleTwo("Practice");
		assertEquals("ct", result);

	}
	
}

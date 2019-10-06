package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddleTest {

	@Test
	public void testMiddleThree() {
		Middle middle = new Middle();
		
		String result = middle.middleThree("Candy");
		
		assertEquals("and", result);
	}
	
	@Test
	public void testMiddleThree1() {
		Middle middle = new Middle();
		
		String result = middle.middleThree("and");
		
		assertEquals("and", result);
	}
	
	@Test
	public void testMiddleThree2() {
		Middle middle = new Middle();
		
		String result = middle.middleThree("solving");
		
		assertEquals("lvi", result);
	}

}

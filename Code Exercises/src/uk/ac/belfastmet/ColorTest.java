package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {

	@Test
	public void testSeeColor() {
		Color color = new Color();
		
		String result = color.seeColor("redxx");
		
		assertEquals("red", result);
	}
	
	@Test
	public void testSeeColor2() {
		Color color = new Color();
		
		String result = color.seeColor("xxred");
		
		assertEquals("", result);
	}
	
	@Test
	public void testSeeColor3() {
		Color color = new Color();
		
		String result = color.seeColor("blueTimes");
		
		assertEquals("blue", result);
	}

}

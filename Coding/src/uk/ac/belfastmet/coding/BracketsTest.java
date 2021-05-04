package uk.ac.belfastmet.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTest {

	@Test
	public void testIsBalanced() {
		
		String result = Brackets("[()]");
		
		assertEquals("[()]", result);
	}

	

}

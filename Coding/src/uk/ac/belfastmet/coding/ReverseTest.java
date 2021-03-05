package uk.ac.belfastmet.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void testReverse() {
		
		String result = Reverse("gerald");
		
		assertEquals("dlareg", result);
		
		
	}

}

package uk.ac.belfastmet.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatTest {

	@Test
	public void testConcatenate() {
		
		String result = StringCat.concatenate("dog", "cat");
		
		assertEquals("dogcat", result);
	}

}

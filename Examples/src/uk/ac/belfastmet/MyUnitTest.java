package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one", "two");
				
		assertEquals("onetwo", result);
	
	}
	
	@Test
	public void testnewConcatenate() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("three", "four");
				
		assertEquals("threefour", result);
	}
	

}

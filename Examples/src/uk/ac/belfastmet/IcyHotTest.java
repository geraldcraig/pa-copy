package uk.ac.belfastmet;

import static org.junit.Assert.*;

import org.junit.Test;

public class IcyHotTest {

	@Test
	public void testReturnIcyHot() {
		IcyHot icyHot = new IcyHot();
		
		boolean result = icyHot.returnIcyHot(120, -1);
		
		assertEquals(true, result);
	}
	
	@Test
	public void testReturnIcyHot1() {
		IcyHot icyHot = new IcyHot();
		
		boolean result = icyHot.returnIcyHot(-1, 120);
		
		assertEquals(true, result);
	}
	
	@Test
	public void testReturnIcyHot2() {
		IcyHot icyHot = new IcyHot();
		
		boolean result = icyHot.returnIcyHot(2, 120);
		
		assertEquals(false, result);
	}

}

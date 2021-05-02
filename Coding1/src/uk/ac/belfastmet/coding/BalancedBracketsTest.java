package uk.ac.belfastmet.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsTest {

	@Test
	public final void test() {

		String result = BalancedBrackets.balancedBrackets("[()]"); 

		assertEquals("Balanced", result);
	}

	@Test
	public final void test1() {

		String result = BalancedBrackets.balancedBrackets("{[]}"); 

		assertEquals("Balanced", result);
	}

	@Test
	public final void test2() {

		String result = BalancedBrackets.balancedBrackets("[]{}()"); 

		assertEquals("Balanced", result);
	}

	@Test
	public final void test3() {

		String result = BalancedBrackets.balancedBrackets("[)[)"); 

		assertEquals("Not Balanced", result);
	}

	@Test
	public final void test4() {

		String result = BalancedBrackets.balancedBrackets("()]()"); 

		assertEquals("Not Balanced", result);
	}

	@Test
	public final void test5() {

		String result = BalancedBrackets.balancedBrackets(" "); 

		assertEquals("Not Balanced", result);
	}

}

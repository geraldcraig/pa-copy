package uk.ac.belfastmet.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	 @Test
	    public void testBasics() {
	      assertEquals(23, new Solution().solution(10));
	    }
	 
	 @Test
	    public void testBasics1() {
	      assertEquals(9168, new Solution().solution(200));
	    }


}

package com.mahendra.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InterestCalculatorTest {

	//@Test
	// Test case method
	// 1. Test case method should return VOID
	// 2. name should begin with test
	// 3. Should be no arguments 
	//void test1() {
	//	assertEquals(10, 11,"Actual was not same as expected");
	//}
	
//	@Test
//	void test2() {
//		assertEquals(10, 10);
//	}

	@Test
	public void testPrincipal() {
		InterestCalculator calc = new InterestCalculator();
		calc.setPrinciple(100);
		//expecting ZERO as 100 is below lower limit 10000
		assertEquals(0,calc.getPrinciple(),"Minimum principal should be 10000");
	}
}

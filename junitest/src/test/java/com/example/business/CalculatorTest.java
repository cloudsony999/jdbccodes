package com.example.business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void callFirst() {
		System.out.println("@BeforeClass must run only once for the class so this method must be static");
	}

	@Before
	public void callBeforeATestCase() {
		System.out.println("@Before will run 3 times");
	}

	@Test
	public void testCase1() {
		System.out.println("@TEST1");
	}

	@Test
	public void testCase2() {
		System.out.println("@TEST2");
	}

	@Test
	public void testCase3() {
		System.out.println("@TEST3");
	}

	@After
	public void aftertestCase() {
		System.out.println("@After will run 3 times");
	}

	@AfterClass
	public static void callLast() {
		System.out.println("@AfterClass must run only once for the class so this method must be static");
	}

//	@Test
//	public void testSum() {
//		
//	}
//
//	@Test
//	public void testSub() {
//		
//	}

}

package com.example.business;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SomeTest {
	static int a, b;

	@BeforeClass
	public static void takeNum() {
		a = b = 50;
		System.out.println("a=b=50 set!!!");

	}

	@Test
	public void testSum() {
		assertEquals("checking sum...", 100, new Calculator().sum(a, b));

	}

	@Test
	public void testSub() {
		assertEquals("checking sub...", 0, new Calculator().sub(a, b));
	}

	@Ignore
	public void dontwant() {
		System.out.println("I don't want 2 run this test case..........");

	}

	@AfterClass
	public static void reset() {
		a = b = 0;
		System.out.println("a=b=0 reset!!!");

	}

}

package com.example.business;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SomeTestUsingJunit5 {
	static int a, b;

	@BeforeAll
	public static void takeNum() {
		a = b = 50;
		System.out.println("a=b=50 set!!!");

	}

	@BeforeEach
	public void runBeforeEachMethod() {
		System.out.println("I don't want 2 run this test case..........");

	}

	@Test
	public void testSum() {
		assertEquals("checking sum...", 100, new Calculator().sum(a, b));

	}

	@Test
	public void testSub() {
		assertEquals("checking sub...", 0, new Calculator().sub(a, b));
	}

	@AfterEach
	public void runAfterEachMethod() {
		System.out.println("I don't want 2 run this test case..........");

	}

	@Disabled
	public void dontwant() {
		System.out.println("I don't want 2 run this test case..........");

	}

	@RepeatedTest(value = 5)
	public void run5times() {
		System.out.println("Run 5 times..........");

	}

	@AfterAll
	public static void reset() {
		a = b = 0;
		System.out.println("a=b=0 reset!!!");

	}

}

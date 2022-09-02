package com.example.business;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonTest {

	static Person p;

	@BeforeAll
	public static void createPerson() {
		p = new Person();
		p.setPid(10);
		p.setPname("amitava");

	}

	@Test
	void test() {
		Payment pay = new PaymentImpl();
		assertThat(pay.payToPerson(p.getPname())).isTrue();
	}

}

package com.example.business;

public class PaymentImpl implements Payment {

	@Override
	public boolean payToPerson(String name) {
		if (name.length() >= 3)
			return true;
		else
			return false;

	}

}

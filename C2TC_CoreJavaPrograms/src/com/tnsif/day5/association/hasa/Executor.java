package com.tnsif.day5.association.hasa;

public class Executor {

	public static void main(String[] args) {
		Address address = new Address("27/6B Paruthikattuvilai,Thiruvithancode", "Kanya Kumari", "Tamil Nadu", "629174");
		Person person = new Person("Alfrin", address);
		person.displayInfo();
	}

}

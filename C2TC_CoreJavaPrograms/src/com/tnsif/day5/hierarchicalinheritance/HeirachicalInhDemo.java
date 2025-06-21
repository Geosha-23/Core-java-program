package com.tnsif.day5.hierarchicalinheritance;

public class HeirachicalInhDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Geosha", "Chennai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Harini", "Chennai", 30, 68000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Gracelin", "Chennai", "F", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}

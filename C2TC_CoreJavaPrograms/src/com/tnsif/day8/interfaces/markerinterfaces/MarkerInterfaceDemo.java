package com.tnsif.day8.interfaces.markerinterfaces;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(23,"Geoshh",12000,"Java");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			


	}

}

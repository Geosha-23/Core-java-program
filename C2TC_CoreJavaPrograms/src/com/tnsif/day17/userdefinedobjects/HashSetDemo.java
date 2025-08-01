package com.tnsif.day17.userdefinedobjects;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<Student>();
		addElements(studentSet);
		System.out.println(studentSet);		
	}

	static void addElements(Set<Student> studentSet) {

		Student s1 = new Student("Geoshh",78);
		studentSet.add(s1);
		s1 = new Student("Geo",66);
		studentSet.add(s1);
		s1 = new Student( "Grace",73);
		studentSet.add(s1);
		s1 = new Student("Neha",81);
		studentSet.add(s1);
		s1 = new Student("Harini",81);
		//duplicate element can't insert
		studentSet.add(s1); 
	}

}

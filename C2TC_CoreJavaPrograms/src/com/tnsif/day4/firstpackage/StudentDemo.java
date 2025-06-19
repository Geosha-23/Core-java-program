package com.tnsif.day4.firstpackage;

public class StudentDemo {

	public static void main(String[] args) {
      Student st = Student.getS1();
		
		st.setId(23);
		st.setName("Geo");
		
		Student st1 = Student.getS1();
		System.out.println(st1);
		//System.out.println(st);
	}
	}



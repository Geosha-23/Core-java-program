package com.tnsif.day7.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
	   
		System.out.println("------Constructor------");
		
		//Default constructor
		Point p = new Point();
		System.out.println(p);
		
		//single parameter 
		Point p1 = new Point(2.5f);
		System.out.println(p1);
		
		//two parameters
		Point p2 = new Point(5.5f,10.5f);
		System.out.println(p2);
		
		System.out.println("------Method Overloading------");
		System.out.println("Addition of two integers : " + MethodOverloading.addition(50, 20));
		System.out.println("Addition of two floating numbers :" + MethodOverloading.addition(25.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + MethodOverloading.addition(75, 30.0f));
		System.out.println("Addition of one float and one integer :" + MethodOverloading.addition(15.0f, 27));
		System.out.println("Addition of two Strings : " + MethodOverloading.addition("Hello ", "World"));
	}
}
	



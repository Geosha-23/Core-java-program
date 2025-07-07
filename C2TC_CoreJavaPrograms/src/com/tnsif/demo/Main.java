package com.tnsif.demo;

public class Main {

	public static void main(String[] args) {
		//creating the object for interface by the implemented class
		InterfaceDemo obj = new Demo();
		obj.display();
		
		//Anonymous class
		InterfaceDemo obj1 = new InterfaceDemo() {
			public void display() {
				System.out.println("In Anomymous class");
			}
		};
		obj1.display();
		//lambda expression - functional interface
		InterfaceDemo obj2 = () -> System.out.println("In Anomymous class");
			
	
	}

}

package Polymorphism.overloadingexample;

public class Executor {

	public static void main(String[] args) {
		System.out.println("1.Addition:"+OverloadingExample.addition("Hello", "World"));
		System.out.println("1.Addition:"+OverloadingExample.addition(20,30));
		System.out.println("1.Addition:"+OverloadingExample.addition(25,5.56f));
		System.out.println("1.Addition:"+OverloadingExample.addition(23.9f,239));
		System.out.println("1.Addition:"+OverloadingExample.addition(0.23f, 0.27f));
		
		
		Person p1=new Person();//default constructor
		System.out.println(p1);
		
		 p1=new Person(123,"Grace");//2 parameters
		 System.out.println(p1);
		 
		 p1=new Person(235,"Harini","Chennai");
		 System.out.println(p1);
	}

}

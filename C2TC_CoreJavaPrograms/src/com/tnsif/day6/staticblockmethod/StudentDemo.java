package com.tnsif.day6.staticblockmethod;

public class StudentDemo {
	
    static {
   
       System.out.println("hi welcome all!!");
 }

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		
		Student s1=new Student();
		System.out.println(s1);
		
		Student s2=new Student();
		System.out.println(s2);

	}
	 static {
	  System.out.println("hi");
}


}


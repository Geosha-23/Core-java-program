package com.tnsif.day4.firstpackage;

public class Base {
	// Declaring default, public, private and protected variables
	int varDefault=5;
	public int varPublic=10;
	private int varPrivate=20;
	protected int varProtected=30;
	
	
	 //Declaring methods with default, public, private, protected types
	 

	void methodDefault()
	{
		System.out.println("Default access Base class");
		System.out.println("Default Variable : "+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access Base class");
		System.out.println("Public Variable : "+varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access Base class");
		System.out.println("Private Variable : "+varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : "+varProtected);
	}
}

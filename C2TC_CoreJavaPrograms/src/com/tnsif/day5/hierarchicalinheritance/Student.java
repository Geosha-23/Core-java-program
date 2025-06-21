package com.tnsif.day5.hierarchicalinheritance;

public class Student extends Person{
	private String section;
	private float percentage;
	public Student() {
		System.out.println("Student class default constructor");
		section="FY";
		percentage=70;
		
	}
	
	public Student(String section, float percentage) {
		super();
		this.section = section;
		this.percentage = percentage;
	}

	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public Student(String name, String city, String section, float percentage) {
		super(name, city);
		this.section = section;
		this.percentage = percentage;
			}
	@Override
	public String toString() {
		return "Student [section=" + section + ", percentage=" + percentage + "]";
	}
	
}
	
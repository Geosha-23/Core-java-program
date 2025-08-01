package com.tnsif.day5.singleinheritance;
//This program to demonstrate person base class
public class Person {
private int id;
private String name;
private String city;
//Default constructor
public Person() {
	
	this.id =23;
	this.name = "Geo";
	this.city = "Chennai";
}
//Parameterized constructor
public Person(int id, String name, String city) {
	
	this.id = id;
	this.name = name;
	this.city = city;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getCity()=" + getCity() + "]";
}

}

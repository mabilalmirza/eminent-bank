package com.ecib;

public class Customer extends Human {

	private String nationality;

	public Customer(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public String toString() {
		return "ID: " + getName() + ", Name: " + getName() + ", Age: " + getAge();
	}
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
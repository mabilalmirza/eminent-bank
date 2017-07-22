package com.ecib;

public class Customer {

	private int id;
	private String name;
	private int age;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {

		if (age < 0) {
			this.age = -1 * age;
		} else {
			this.age = age;
		}

	}

	public String toString() {
		return "ID: " + this.id + ", Name: " + this.name + ", Age: " + this.age;
	}

}
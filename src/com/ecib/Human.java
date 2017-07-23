package com.ecib;

public class Human {

	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {

		if (age < 0) {
			this.age = -1 * age;
		} else {
			this.age = age;
		}
	}
	
}

package com.ecib;

public class Employee {

	private int id;
	private String cnic;
	private String name;
	private int age;
	private String designation;
	private String phone;
	private String address;
	
	public Employee(int id, String cnic, String name) {
		this.id = id;
		this.cnic = cnic;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getCnic() {
		return cnic;
	}

	public String getName() {
		return name;
	}
	
}

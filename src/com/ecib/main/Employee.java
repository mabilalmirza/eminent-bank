package com.ecib.main;

import com.ecib.Human;

public class Employee extends Human {

	private String cnic;
	private String designation;
	private String phone;
	private String address;
	
	public Employee(int id, String name, String cnic) {
		setId(id);
		setName(name);
		this.cnic = cnic;
	}

	public String getCnic() {
		return cnic;
	}

	public void setCnic(String cnic) {
		this.cnic = cnic;
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
	
}

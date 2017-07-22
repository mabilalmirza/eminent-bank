package com.ecib;

public class Account{

	private int number;
	private int customerId;
	private String type;
	private double balance;

	public Account(int number, int customerId, String type) {
		this.number = number;
		this.customerId = customerId;

		if ("current".equals(type) || "saving".equals(type)) {
			this.type = type;
		} else {
			this.type = "current";
		}

	}

	public int getNumber() {
		return this.number;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public String getType() {
		return this.type;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String toString() {
		return "Number: " + this.number + ", Customer ID: " + this.customerId + ", Type: " + this.type + ", Balance: " + this.balance;
	}


}
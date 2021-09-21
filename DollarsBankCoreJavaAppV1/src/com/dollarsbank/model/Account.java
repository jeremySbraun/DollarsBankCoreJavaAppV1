package com.dollarsbank.model;

import org.w3c.dom.UserDataHandler;

public class Account {

	
	private String fullName;
	
	private String address;
	
	private String ContactNumber;
	
	private String userId;
	
	private String password;
	
	private double depositedAmount;

	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Account(String fullName, String address, String contactNumber, String userId, String password,
			double depositedAmount) {
		super();
		this.fullName = fullName;
		this.address = address;
		ContactNumber = contactNumber;
		this.userId = userId;
		this.password = password;
		this.depositedAmount = depositedAmount;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getDepositedAmount() {
		return depositedAmount;
	}

	public void setDepositedAmount(double depositedAmount) {
		this.depositedAmount = depositedAmount;
	}
	
	
}

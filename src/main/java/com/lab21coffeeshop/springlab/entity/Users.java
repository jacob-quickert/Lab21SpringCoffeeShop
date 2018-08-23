package com.lab21coffeeshop.springlab.entity;

public class Users {
	private int userID;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public Users() {
		userID = 0;
		firstName = "";
		lastName = "";
		email = "";
		phone = "";
	}
	
	public Users(int userID, String firstName, String lastName, String email, String phone) {
		super();
		this.userID = userID;
		this.firstName = firstName;		
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone;
	}

	
	
}

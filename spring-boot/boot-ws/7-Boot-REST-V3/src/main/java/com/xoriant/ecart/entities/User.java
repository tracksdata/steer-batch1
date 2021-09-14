package com.xoriant.ecart.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userId;
	private String name;
	private long phoneNumber;
	private String emailAddress;

	private List<Cart> cartItems=new ArrayList<Cart>();

	public List<Cart> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Cart> cartItems) {
		this.cartItems = cartItems;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String name, long phoneNumber, String emailAddress) {
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + ", cartItems=" + cartItems + "]";
	}
	
	

}

package com.xoriant.product.model;

public class Account {

	private long accNo;
	private String custName;
	private String accType;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(long accNo, String custName, String accType, double balance) {

		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void dislay() {
		System.out.println("-------------------------------------");
		System.out.println("Account NO:: "+accNo);
		System.out.println("Customer Name: "+custName);
		System.out.println("Account Type: "+accType);
		System.out.println("Balance: "+balance);
		System.out.println("-------------------------------------");
	}
	


}

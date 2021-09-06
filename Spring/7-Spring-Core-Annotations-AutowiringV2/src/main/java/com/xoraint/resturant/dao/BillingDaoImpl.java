package com.xoraint.resturant.dao;

public class BillingDaoImpl {

	public double orderItemList(String[] order) {

		double total = 0.0;
		for (String item : order) {
			total += total + 100;
		}

		return total;
	}

}

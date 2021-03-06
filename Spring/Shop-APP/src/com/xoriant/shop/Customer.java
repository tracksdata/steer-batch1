package com.xoriant.shop;

import com.xoriant.shop.dao.PriceMatrixDaoImpl;
import com.xoriant.shop.service.BillingServiceImpl;

public class Customer {

	public static void main(String[] args) {

		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item01", "Item02"};
		
		//===============================================
		PriceMatrixDaoImpl price=new PriceMatrixDaoImpl(); // dependency
		//===============================================

		BillingServiceImpl biller = new BillingServiceImpl(price); // dependent
		
		//biller.setPrice(price); // DI: Injection dependency object (price) to the dependent object(biller)

		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}

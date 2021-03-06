package com.xoriant.shop.service;

import com.xoriant.shop.dao.PriceMatrixDaoImpl;

//Dependent
public class BillingServiceImpl {
	
	
	
	/*
	 * Design Issues
	 * -----------------
	 * 	-> too many dependency class objects
	 * 			-> memory management is difficult
	 * 			-> perfomance of application goes down
	 * 
	 *  Why this issue happened?
	 *  ----------------------------
	 *  -> dependent class itself creating dependency class object directly.
	 *  
	 *  what is the solution?
	 *  ----------------------
	 *  -> do not create dependency object in the dependent class directly
	 *  -> instead use look up  techniques like 'JNDI'
	 *  	-> dependent class is tightly coupled with JNDI location
	 *  
	 *  What is the best solution?
	 *  ----------------------------
	 *  -> do not create, do not look up, instead ask some (container) one to inject. IoC(inversion of controller)
	 * 
	 *  How can IoC can be implemented?
	 *  ---------------------------------
	 *  -> using dependency injection (DI) technique 
	 *  
	 *  What is Dependency Injection? (DI)
	 *  --------------------------------
	 *  -> Injecting / passing dependency object to the dependent object
	 *  
	 *  How to implement DI? : 2 ways
	 *  --------------------------
	 *  1. setter based injection
	 *  2. constructor based injection
	 *  
	 * 1. setter based injection
     * --------------------------------
     *  Rules
     *  	-> define Dependency class referance at dependent class level
     *  	-> create setter method for the above defined ref. 
	 *  
	 * 
	 */
	
	private PriceMatrixDaoImpl price; // 
	
	
	public BillingServiceImpl(PriceMatrixDaoImpl price) {
		this.price = price;
	}


	public void setPrice(PriceMatrixDaoImpl price) {
		this.price = price;
	}


	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixDaoImpl price = new PriceMatrixDaoImpl();// dependency obj

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;
	}
}

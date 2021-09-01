package com.xoriant.shop.dao;

//Dependency
public class PriceMatrixDaoImpl {
	
	public PriceMatrixDaoImpl() {
		System.out.println(">>>> PriceMatrixDaoImpl object craeted...");
	}
	
	/*
	 * Types of Objects: 2 types
	 * ------------------
	 *  1. dependent object : always depends on dependency
	 *  2. dependency object: never depends on any other objects. works independently
	 * 
	 * 
	 */
	
	public double getItemPrice(String itemCode) {
		// code to fetch price of given itemCode from database
		return 100.00;	
	}
}

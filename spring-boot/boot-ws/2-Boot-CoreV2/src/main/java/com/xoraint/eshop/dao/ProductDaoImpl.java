package com.xoraint.eshop.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Value("${name}")
	private String personName;
	
	@Value("${maxPrice}")
	private double price;

	@Override
	public void save() {
		System.out.println("hey " + personName);
		System.out.println(">>> Max price is "+price);
		System.out.println(">>> save method of ProductDaoImpl");
	}

}

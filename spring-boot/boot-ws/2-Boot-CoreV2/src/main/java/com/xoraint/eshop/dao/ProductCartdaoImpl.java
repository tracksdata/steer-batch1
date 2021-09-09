package com.xoraint.eshop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductCartdaoImpl implements ProductCartDao {
	
	@Override
	public void loadCartItems() {
		System.out.println(">>>> loadCartItems method of ProductCartdaoImpl");
	}

}

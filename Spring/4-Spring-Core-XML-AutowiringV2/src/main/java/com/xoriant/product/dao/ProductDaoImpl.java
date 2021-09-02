package com.xoriant.product.dao;

import java.util.List;

import com.xoriant.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	// CRUD operations
	// 1.save
	@Override
	public void save(Product product) {
		System.out.println(product.getName() + " saved to database....");
	}

	// display all products

	@Override
	public List<Product> findAll() {
		System.out.println(">>>> Display all Products...");
		return null;
	}

	// find a single product by product id

	@Override
	public Product findById(String id) {
		System.out.println(">>>> Finding product for " + id);
		return null;
	}

	@Override
	public void delete(String id) {
		System.out.println(">>>> deleting produuct of " + id);
	}

}

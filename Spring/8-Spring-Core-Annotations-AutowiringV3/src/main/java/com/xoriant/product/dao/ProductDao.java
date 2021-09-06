package com.xoriant.product.dao;

import java.util.List;

import com.xoriant.product.model.Product;

public interface ProductDao {

	
	void save(Product product);

	List<Product> findAll();

	Product findById(String id);

	void delete(String id);

}
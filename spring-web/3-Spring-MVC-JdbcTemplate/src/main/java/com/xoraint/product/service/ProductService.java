package com.xoraint.product.service;

import java.util.List;

import com.xoraint.product.model.Product;

public interface ProductService {
	
	// save product
	void save(Product product);

	// find a Single Record using id
	Product findById(String id);

	// find all products from product table as java.util.list interface
	List<Product> listProducts();


}

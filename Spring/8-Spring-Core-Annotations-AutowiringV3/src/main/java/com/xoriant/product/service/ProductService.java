package com.xoriant.product.service;

import java.util.List;

import com.xoriant.product.model.Product;

public interface ProductService {

	void save(Product product);

	List<Product> findAll();

	Product findById(String id);

	void delete(String id);

}
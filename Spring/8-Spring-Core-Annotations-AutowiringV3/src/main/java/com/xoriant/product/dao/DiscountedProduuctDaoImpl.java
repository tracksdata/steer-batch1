package com.xoriant.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xoriant.product.model.Product;
@Repository
public class DiscountedProduuctDaoImpl implements ProductDao {

	@Override
	public void save(Product product) {
		System.out.println(">>>> DiscountedProductDaoImpl save method");

	}

	@Override
	public List<Product> findAll() {
		System.out.println(">>>> DiscountedProductDaoImpl findAll method");
		return null;
	}

	@Override
	public Product findById(String id) {
		System.out.println(">>>> DiscountedProductDaoImpl find method");

		return null;
	}

	@Override
	public void delete(String id) {
		System.out.println(">>>> DiscountedProductDaoImpl delete method");

	}

}

package com.xoriant.product.service;

import java.util.List;

import com.xoriant.product.model.Brand;
import com.xoriant.product.model.Product;

public interface ProductService {
	// find all brand names
	List<Brand> findAllBrands();

	// filter products by brand
	List<Product> filterProductsByBrandName(String brandName);

	// filter products by Price max and min range
	List<Product> filterProductsByMaxPriceRange(int maxPrice);

	// filter products by Price max and min range
	List<Product> filterProductsByMinAndMaxRange(int minPrice, int maxPrice);

	// find all products
	List<Product> findAll();

	// fetch products by catagoryId
	List<Product> getProductByCategory(int catagoryId);

	// Find product By Product ID
	public Product findById(int productId);

}

package com.xoriant.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.product.model.Product;
import com.xoriant.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	// find all products
	@GetMapping
	public List<Product> findAllProducts() {
		return productService.findAll();
	}
	
	// find by Product ID
	@GetMapping("/{productId}")
	public Product findById(@PathVariable int productId) {
		Product product=productService.findById(productId);
		return product;
	}
	
	// find by Product ID
	@GetMapping("/category/{categoryId}")
	public List<Product> findByCategoryId(@PathVariable int categoryId) {
		return productService.getProductByCategory(categoryId);
	}
	
	
	
	
	

}

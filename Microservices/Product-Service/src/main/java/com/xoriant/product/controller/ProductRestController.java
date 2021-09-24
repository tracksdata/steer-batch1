package com.xoriant.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.product.model.Brand;
import com.xoriant.product.model.Product;
import com.xoriant.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping()
	public Product save(@RequestBody Product product) {
		System.out.println(product);
		return productService.save(product);
	}
	
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
	
	
	// 1. Find all Products by Brand Name
	@GetMapping("/brands/{brandName}")
	public List<Product> filterByBrandName(@PathVariable String brandName){
		return productService.filterProductsByBrandName("%"+brandName+"%");
	}
	// 2. Find All Brand Names
	@GetMapping("/brands")
	public List<Brand> findAllBrands(){
		return productService.findAllBrands();
	}
	// 3. Filter Products by Min and Max Price
	
	@GetMapping("/{minPrice}/{maxPrice}")
	public List<Product> findProductsByMinAndMaxPrice(@PathVariable int minPrice,@PathVariable int maxPrice){
		return productService.filterProductsByMinAndMaxRange(minPrice, maxPrice);
	}
	// 4. Filter Products by  product Max price Range
	@GetMapping("/price/{maxPrice}")
	public List<Product> findProductsByMaxPrice(@PathVariable int maxPrice){
		return productService.filterProductsByMaxPriceRange(maxPrice);
	}
	
	
	

}

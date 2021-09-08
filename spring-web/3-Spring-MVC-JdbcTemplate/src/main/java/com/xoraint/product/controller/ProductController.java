package com.xoraint.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xoraint.product.model.Product;
import com.xoraint.product.service.ProductService;
import com.xoraint.product.service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	// find all products
	
	@RequestMapping(value = "/findAll")
	public String findAll(Model model) {
		// fetch products from database
		List<Product> prods = productService.listProducts();
		
		model.addAttribute("products", prods);
		
		return "products";
	}
	
	
	
	
	

}

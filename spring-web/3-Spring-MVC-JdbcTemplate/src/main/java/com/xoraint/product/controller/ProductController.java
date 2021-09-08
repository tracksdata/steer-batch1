package com.xoraint.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xoraint.product.model.Product;
import com.xoraint.product.service.ProductService;
import com.xoraint.product.service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}
	
	
	// load form
	@RequestMapping(value = "loadForm")
	public String loadProductForm() {
		return "product-form";
	}
	
	
	// load find-product-form page
	@RequestMapping(value = "find-product-form")
	public String laodFindForm() {
		return "find-product-form";
	}
	
	// find a product using ID
	@RequestMapping(value = "findProduct")
	public String findProduct(@RequestParam("id")String id,Model model) {
		
		Product product = productService.findById(id);
		if(product!=null) {
			model.addAttribute("prod", product);
			return "product";
		}
		model.addAttribute("msg", "Product ID "+id+" notg found in database");
		
		return "index";
	}
	
	// save product
	@RequestMapping(value = "saveProduct")
	public String saveProduct(@ModelAttribute Product prod,Model model) {
		
		productService.save(prod);
	
		model.addAttribute("msg", "Product "+prod.getName()+"is added to database successfully");
		
		return "index";
	}
	
	// find all products
	
	@RequestMapping(value = "/findAll")
	public String findAll(Model model) {
		// fetch products from database
		List<Product> prods = productService.listProducts();
		
		model.addAttribute("products", prods);
		
		return "products";
	}
	
	
	
	
	

}

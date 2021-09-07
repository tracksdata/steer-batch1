package com.xoraint.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/s1")
	public String f1(Model model) {
		System.out.println(">>>>>> f1 method of ProductController class <<<<<<");
		
		// connect to DB
		
		String str="Abc";
		
		model.addAttribute("userName", "Praveen");
		model.addAttribute("city", "Hyderabad");
		
		
		return "one";
	}
	
	@RequestMapping("/s2")
	public String f2() {
		System.out.println(">>>>>> f2 method of ProductController class <<<<<<");
		return "test";
	}
	@RequestMapping("/loadForm")
	public String productForm() {
		System.out.println(">>>>>> f2 method of ProductController class <<<<<<");
		return "product-form";
	}


}

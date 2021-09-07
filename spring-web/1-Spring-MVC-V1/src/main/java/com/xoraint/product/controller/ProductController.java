package com.xoraint.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/")
	public void test() {
		System.out.println(">>>>>> test method of ProductController class <<<<<<");
	}

}

package com.xoriant.ecart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {
	
	@GetMapping
	public String f1() {
		return "Abc";
	}
	
	

}

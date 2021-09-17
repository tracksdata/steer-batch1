package com.xoriant.price.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.price.model.Product;
import com.xoriant.price.service.PriceService;

@RestController
@RequestMapping("/api/price")
public class PriceServiceRestController {
	
	@Autowired
	private PriceService priceService;
	
	@GetMapping("/{productId}")
	public Product getProductPrice(@PathVariable int productId) {
		return priceService.getProductPrice(productId);
	}

}

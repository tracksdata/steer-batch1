package com.xoriant.ecart.entities;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	// Autowire to Service

	@PostMapping
	public void addToCart(@RequestBody User user) {
		// calculate total
		double totalPrice = 0;
		for(Cart cart:user.getCartItems()) {
			totalPrice+=cart.getQuantity()*cart.getItemPrice();
		}
		
		
		System.out.println("=========================");
		System.out.println(user);
		System.out.println("Total: "+totalPrice);
		System.out.println("=========================");

	}

}

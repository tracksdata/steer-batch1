package com.xoriant.ecart.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	@GetMapping("/s1")
	public String getDemo() {
		return "This is GET request data";
	}
	
	/*
	@GetMapping("/s1") // wrong
	public List<Object> getDemoV5() {
		return null;
	}
	*/
	
	@GetMapping("/s1/{productId}") 
	public String getDemoV2(@PathVariable int productId) {
		return "This is GET request data V2 for Product ID: "+productId;
	}
	
	@GetMapping("/s1/byName/{productName}") 
	public String getDemoV3(@PathVariable String productName) {
		return "This is GET request data V3 for Product ID: "+productName;
	}
	
	@GetMapping("/s1/{userName}/{orderId}")
	public String getDemoV4(@PathVariable String userName,@PathVariable("orderId") String id) {
		return "This is GET request data V4 "+userName+" and order id "+id;
	}
	
	@GetMapping("/s11") 
	public String getDemoV1() {
		return "This is GET request data V1";
	}
	
	@PutMapping("/s1")
	public String putDemo() {
		return "This is PUT request data";
	}
	@DeleteMapping("/s1")
	public String deleteDemo() {
		return "This is DELETE request data";
	}
	
	@PostMapping("/s1")
	public String postDemo() {
		return "This is POST request data";
	}
	
	@PatchMapping("/s1")
	public String patchDemo() {
		return "This is PATCH request data";
	}


}

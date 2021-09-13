package com.xoriant.ecart.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	@GetMapping("/s1")
	public String getDemo() {
		return "This is GET request data";
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

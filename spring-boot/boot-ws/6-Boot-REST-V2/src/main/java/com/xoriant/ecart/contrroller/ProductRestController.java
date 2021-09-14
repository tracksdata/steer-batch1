package com.xoriant.ecart.contrroller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.ecart.entities.Product;
import com.xoriant.ecart.utils.ProductData;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

	// Domain return type: always JSON by default
	@GetMapping
	public Product findProduct() {
		Product prod = new Product("P001", "Pen", 100, "red Pen");
		return prod;
	}

	// Array as response
	@GetMapping("/names")
	public String[] test() {
		String data[] = { "Abc", "Xyz" };
		return data;
	}

	// Domain JSOn array as response
	@GetMapping("/findAll")
	public List<Product> findAll() {

		return ProductData.getProducts();
	}

	// Saving Object using POST Mapping

	@PostMapping
	public Product save(@RequestBody Product prod) {
		System.out.println(">>>>> " + prod.getName());
		return ProductData.saveProduct(prod);
	}

	// find a product
	@GetMapping("{productId}")
	public Product findById(@PathVariable String productId) {
		return ProductData.findProduct(productId);
	}

	// find a product v1
	@GetMapping("/find/{productId}")
	public ResponseEntity<?> findByIdV1(@PathVariable String productId) {
		
		Product prod=ProductData.findProduct(productId);
		if(prod==null) {
			return new ResponseEntity<>("Product ID "+productId+" Not Found", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(prod, HttpStatus.OK);
	}

	/*
	 * @GetMapping(value = "v1") public Product findProductV1() { Product prod = new
	 * Product("P002", "Book", 3445, "Spring Book"); return prod; }
	 */

}

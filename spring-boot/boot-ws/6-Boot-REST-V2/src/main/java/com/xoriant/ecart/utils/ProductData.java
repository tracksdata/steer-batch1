package com.xoriant.ecart.utils;

import java.util.ArrayList;
import java.util.List;

import com.xoriant.ecart.entities.Product;

public class ProductData {

	private static List<Product> prods;

	public static List<Product> getProducts() {
		if (prods == null) {
			prods = new ArrayList<Product>();
		}
		Product p1 = new Product("P001", "Pen", 100, "Red Ink");
		Product p2 = new Product("P002", "Book", 2500, "Java");
		Product p3 = new Product("P003", "Laptop", 56000, "HP I5");
		Product p4 = new Product("P004", "Mobile", 23000, "Samsung A2");
		Product p5 = new Product("P005", "Usb", 1899, "128 GB");

		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);
		return prods;
	}
	
	
	public static Product findProduct(String productId) {
		return prods.stream().filter(prod->prod.getId().equals(productId)).findAny().orElse(null);
	}

	public static Product saveProduct(Product prod) {
		if (prods != null) {
			prods.add(prod);
			System.out.println(">>>>>> ");
			return prod;
		}
		System.out.println(">>>>>>>>>>>>>");
		return null;
	}

}

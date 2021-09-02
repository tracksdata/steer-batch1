package com.xoriant.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.product.model.Product;
import com.xoriant.product.service.ProductService;

public class Customer {

	public static void main(String[] args) {

		System.out.println(">>> Main <<<");

		Product p1 = new Product("P001", "Pen", 56, "Red Ink");
		Product p2 = new Product("P002", "Book", 3500, "Java Spring");

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		ProductService prodService = ac.getBean("prodService", ProductService.class);

		prodService.save(p1);
		prodService.findAll();
		prodService.findById("P001");
		prodService.delete("P001");

	}

}

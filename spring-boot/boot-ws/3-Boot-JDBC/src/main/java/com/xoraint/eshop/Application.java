package com.xoraint.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoraint.eshop.dao.ProductDaoImpl;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductDaoImpl dao = ac.getBean(ProductDaoImpl.class);
		
		dao.findAll().forEach(prod->{
			System.out.println(prod);
		});
	}

}

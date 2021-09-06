package com.xoriant.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.product.config.AppConfig;
import com.xoriant.product.dao.ProductdaoImpl;
import com.xoriant.product.model.Product;
import com.xoriant.product.service.ProductServiceImpl;


public class Customer {

	public static void main(String[] args) {

		System.out.println(">>> Main <<<");
		
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		

		ProductdaoImpl ps = ac.getBean(ProductdaoImpl.class);
		ps.save();
		ps.saveV1();
		ps.saveV2();
		ps.saveV3();
		ps.saveV4();
		//ps.saveV5();
		ps.saveProduct();
		
		
		
		ac.close();
		//ac.registerShutdownHook();

		
	}

}

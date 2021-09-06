package com.xoriant.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.product.config.AppConfig;


public class Customer {

	public static void main(String[] args) {

		System.out.println(">>> Main <<<");
		
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		ac.close();
		//ac.registerShutdownHook();

		
	}

}

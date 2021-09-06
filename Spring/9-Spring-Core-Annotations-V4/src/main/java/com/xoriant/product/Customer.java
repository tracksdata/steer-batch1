package com.xoriant.product;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Customer {

	public static void main(String[] args) {

		System.out.println(">>> Main <<<");
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		
		ac.close();
		//ac.registerShutdownHook();

		
	}

}

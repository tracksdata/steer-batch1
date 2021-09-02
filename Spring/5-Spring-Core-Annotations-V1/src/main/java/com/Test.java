package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(">>>> main <<<<");
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		/*
		C1 c1Obj = ac.getBean("o5",C1.class);
		c1Obj.f1();
		*/
		
		
	}

}

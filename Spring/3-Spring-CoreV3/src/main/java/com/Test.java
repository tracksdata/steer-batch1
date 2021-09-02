package com;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoraint.emp.dao.EmployeeDapImpl;

public class Test {

	public static void main(String[] args) throws Exception {
		
		System.out.println(">>>> Main <<<<");
		
		// Get Spring application Context
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		
		Employee e1 = ac.getBean("e1",Employee.class);
		Employee e2 = ac.getBean("e1",Employee.class);

		
		
		
		
		
		
		//ac.close();
		
		
		
		
		
		

	}

}

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
		
		
		Employee empObj1 = ac.getBean("e1",Employee.class);
		Employee empObj2 = ac.getBean("e1",Employee.class);
		
		empObj1.name="Praveen";
		empObj1.display();
		empObj2.display();

		//Employee empObj2 = ac.getBean("e2",Employee.class);
		//Employee empObj3 = ac.getBean("e3",Employee.class);

		
		System.out.println("empObj1 "+ empObj1.hashCode());
		System.out.println("empObj2 "+ empObj2.hashCode());
		//System.out.println("empObj3 "+ empObj3.hashCode());



		
		
		
		
		
		
		ac.close();
		
		
		
		
		
		

	}

}

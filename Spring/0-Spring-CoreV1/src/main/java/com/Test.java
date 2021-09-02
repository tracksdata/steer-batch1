package com;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoraint.emp.dao.EmployeeDapImpl;

public class Test {

	public static void main(String[] args) throws Exception {
		
		System.out.println(">>>> Main <<<<");
		
		
		
		// get Spring application Context
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee empObj = ac.getBean("e1",Employee.class);
		//EmployeeDapImpl dao= (EmployeeDapImpl)ac.getBean("empDao");
		EmployeeDapImpl dao = ac.getBean("empDao",EmployeeDapImpl.class);
		
		dao.save();
		
		empObj.display();
		
		
		ac.close();
		
		
		
		/*
		Scanner sc=new Scanner(System.in);
		
		//Employee emp=new Employee();
		 * 
		System.out.println("Enter class name: ");
		
		String s1=sc.next();
		
	    Class clName= Class.forName(s1); //just loads class into java.lang.Class
	    clName.newInstance(); // creates object to the class that inside clName variable
		*/
		
		
		
		
		
		

	}

}

package com.xoriant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.dept.model.Department;
import com.xoriant.emp.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		// V1
		/*
		Department dept = new Department(); // dependency
		dept.setDeptId(10);
		dept.setDeptName("IT");
		dept.setLocation("Pune");
		
		Employee emp=new Employee(); // dependent
		emp.setEmpId(10000);
		emp.setEmpName("Praveen");
		emp.setSalary(3947397);
		
		// DI
		emp.setDept(dept); // injecting dependency (dept) to the dependent (emp) :: DI
		
		emp.display();
		*/
		
		// Using Spring Dependency Injection
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Department dept = ac.getBean("myDept",Department.class);
		dept.setDeptId(10);
		dept.setDeptName("IT");
		dept.setLocation("Pune");
		
	
		
		
		Employee emp = ac.getBean("emp",Employee.class);
		emp.setEmpId(10000);
		emp.setEmpName("Praveen");
		emp.setSalary(3947397);
		
		//emp.setDept(dept); // DI 
		
		emp.display();
		
		
		
		

	}

}

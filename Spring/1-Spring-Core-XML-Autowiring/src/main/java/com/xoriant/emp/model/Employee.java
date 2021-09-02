package com.xoriant.emp.model;

import com.xoriant.dept.model.Department;

//dependent class
public class Employee {

	private int empId;
	private String empName;
	private double salary;

	private Department d2;
	
	public Employee(Department d2) {
		this.d2 = d2;
	}

	public void setD2(Department d2) {
		this.d2 = d2;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary);

		System.out.println("Dept ID: " + d2.getDeptId());
		System.out.println("Dept Name: " + d2.getDeptName());
		System.out.println("Location: " + d2.getLocation());

	}

}

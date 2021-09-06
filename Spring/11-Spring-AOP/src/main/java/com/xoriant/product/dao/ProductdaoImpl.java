package com.xoriant.product.dao;

import org.springframework.stereotype.Repository;

import com.xoriant.product.model.Product;

@Repository
public class ProductdaoImpl {
	
	
	
	
	public void save() {
		Product p1=new Product();
		p1.setId(10);
		p1.getId();
		System.out.println(">>>> save mehod of ProductdaoImpl");
	}
	
	public void saveV1() {
		Product p1=new Product();
		p1.setId(10);
		p1.getId();
		System.out.println(">>>> save mehod V1 of ProductdaoImpl");
	}
	
	public void saveV2() {
		Product p1=new Product();
		p1.setId(10);
		p1.getId();
		System.out.println(">>>> save mehod V2 of ProductdaoImpl");
	}
	
	public boolean saveV3() {
		Product p1=new Product();
		p1.setId(10);
		p1.getId();
		System.out.println(">>>> Boolean :: save mehod V3 of ProductdaoImpl");
		return true;
	}
	
	public int saveV4() {
		Product p1=new Product();
		p1.setId(10);
		p1.getId();
		System.out.println(">>>> INT:: save mehod V4 of ProductdaoImpl");
		return 1;
	}
	
	public void saveV5() {
		Product p1=new Product();
		p1.setId(10);
		p1.getId();
		System.out.println(">>>> save mehod V5 of ProductdaoImpl");
		if(p1.getId()==10) {
			throw new RuntimeException();
		}
		
	}
	
	
	public void saveProduct() {
		System.out.println("-------------------------------");
		System.out.println("<<<<>>>> saving product...");
		System.out.println("-------------------------------");

	}
	

}

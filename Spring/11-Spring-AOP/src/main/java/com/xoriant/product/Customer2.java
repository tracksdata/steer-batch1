package com.xoriant.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.product.config.AppConfig;
import com.xoriant.product.dao.AccountDaoImpl;
import com.xoriant.product.dao.ProductdaoImpl;
import com.xoriant.product.model.Account;
import com.xoriant.product.model.Product;
import com.xoriant.product.service.ProductServiceImpl;


public class Customer2 {

	public static void main(String[] args) {

		System.out.println(">>> Main <<<");
		
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDaoImpl accDao = ac.getBean(AccountDaoImpl.class);
		
		Account acc1=new Account(10000, "Praveen", "Savings", 15000);
		Account acc2=new Account(20000, "James", "Savings", 15000);
		
		acc1.dislay();
		acc2.dislay();
		
	    accDao.transferFunds(acc1, acc2, 1000);
		
		acc1.dislay();
		acc2.dislay();
		
		

		

		
		
	}

}

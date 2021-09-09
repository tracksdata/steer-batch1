package com.xoraint.eshop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xoraint.eshop.service.ProductCartService;
import com.xoraint.eshop.service.ProductReviewService;
import com.xoraint.eshop.service.ProductService;
import com.xoraint.eshop.service.ProductServiceImpl;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application2.class, args);
		
		ProductService ps = ac.getBean(ProductServiceImpl.class);
		ProductReviewService prs = ac.getBean(ProductServiceImpl.class);
		ProductCartService pks=ac.getBean(ProductServiceImpl.class);
		
		ps.save();
		prs.loadReviews();
		pks.loadCartItems();
		
		
	}

}

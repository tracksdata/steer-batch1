package com.xoraint.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoraint.eshop.dao.ProductCartDao;
import com.xoraint.eshop.dao.ProductDao;
import com.xoraint.eshop.dao.ProductReviewDao;

@Service
public class ProductServiceImpl implements ProductService, ProductReviewService, ProductCartService {
	
	@Autowired
	private ProductDao prodDao;
	@Autowired
	private ProductReviewDao reviewDao;
	@Autowired
	private ProductCartDao cartDao;
	
	@Override
	public void save() {
		System.out.println(">>> save method of ProductServiceImpl");
		prodDao.save();
	}
	
	@Override
	public void loadReviews() {
		System.out.println(">>>> loadReviews method of ProductServiceImpl");
		reviewDao.loadReviews();
	}
	
	@Override
	public void loadCartItems() {
		System.out.println(">>>> loadCartItems method of ProductServiceImpl");
		cartDao.loadCartItems();
	}

}

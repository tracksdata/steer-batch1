package com.xoraint.eshop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductReviewDaoImpl implements ProductReviewDao {

	// JT
	@Override
	public void loadReviews() {
		System.out.println(">>>> loadReviews method of ProductReviewDaoImpl");
	}

}

package com.xoriant.price.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.price.dao.PriceDao;
import com.xoriant.price.model.Product;

@Service
public class PriceServiceImpl implements PriceService {
	@Autowired
	private PriceDao priceDao;

	@Override
	public Product getProductPrice(int productId) {
		return priceDao.getProductPrice(productId);
	}

}

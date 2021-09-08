package com.xoraint.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoraint.product.dao.ProductDao;
import com.xoraint.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao prodDao;

	@Override
	public void save(Product product) {
		prodDao.save(product);
	}

	@Override
	public Product findById(String id) {
		
		return prodDao.findById(id);
	}

	@Override
	public List<Product> listProducts() {
		
		return prodDao.listProducts();
	}
	
	

}

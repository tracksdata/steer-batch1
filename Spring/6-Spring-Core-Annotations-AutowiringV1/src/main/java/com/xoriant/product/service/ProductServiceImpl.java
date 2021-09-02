package com.xoriant.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.product.dao.ProductDao;
import com.xoriant.product.model.Product;

@Service(value = "prodService")
public class ProductServiceImpl implements ProductService {

	private ProductDao prodDao;

	@Autowired
	public ProductServiceImpl(ProductDao prodDao) {
		this.prodDao = prodDao;
	}

	@Override
	public void save(Product product) {
		prodDao.save(product);
	}

	// display all products
	@Override
	public List<Product> findAll() {

		return prodDao.findAll();
	}

	// find a single product by product id
	@Override
	public Product findById(String id) {

		return prodDao.findById(id);
	}

	@Override
	public void delete(String id) {
		prodDao.delete(id);
	}
}

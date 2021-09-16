package com.xoriant.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.product.dao.ProductDao;
import com.xoriant.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> findAllBrands() {
		// TODO Auto-generated method stub
		return productDao.findAllBrands();
	}

	@Override
	public List<Product> filterProductsByBrandName(String brandName) {
		// TODO Auto-generated method stub
		return productDao.filterProductsByBrandName(brandName);
	}

	@Override
	public List<Product> filterProductsByMaxPriceRange(int maxPrice) {
		// TODO Auto-generated method stub
		return productDao.filterProductsByMaxPriceRange(maxPrice);
	}

	@Override
	public List<Product> filterProductsByMinAndMaxRange(int minPrice, int maxPrice) {
		// TODO Auto-generated method stub
		return productDao.filterProductsByMinAndMaxRange(minPrice, maxPrice);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public List<Product> getProductByCategory(int catagoryId) {
		// TODO Auto-generated method stub
		return productDao.getProductByCategory(catagoryId);
	}

	@Override
	public Product findById(int productId) {
		Product product = productDao.findById(productId);
		if (product != null)
			return product;
		else
			return null;
	}

}

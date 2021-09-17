package com.xoriant.price.dao;

import com.xoriant.price.model.Product;

public interface PriceDao {

	Product getProductPrice(int productId);

}
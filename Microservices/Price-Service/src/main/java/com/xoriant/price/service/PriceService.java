package com.xoriant.price.service;

import com.xoriant.price.model.Product;

public interface PriceService {

	Product getProductPrice(int productId);

}
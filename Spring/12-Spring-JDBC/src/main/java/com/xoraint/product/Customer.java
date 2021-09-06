package com.xoraint.product;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoraint.product.config.AppConfig;
import com.xoraint.product.dao.ProductDaoImpl;

public class Customer {

	public static void main(String[] args) {
		System.out.println(">>>> main <<<<");
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
		// System.out.println(prodDao.getTableRowsCount());
		Map<String, Object> prodsV1 = prodDao.getProductsV1();
		// System.out.println(prodsV1);
		List<Map<String, Object>> productsV2 = prodDao.getProductsV2();
		// System.out.println(productsV2);

		prodDao.getProductsV3().forEach(prod -> {
			System.out.println(prod);
		});

	}

}

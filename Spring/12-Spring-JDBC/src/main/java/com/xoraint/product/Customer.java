package com.xoraint.product;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xoraint.product.config.AppConfig;
import com.xoraint.product.dao.ProductDaoImpl;
import com.xoraint.product.model.Product;

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
			//System.out.println(prod);
		});
		
		//prodDao.getProductsV4();
		
		prodDao.getProductsV5().forEach(prod->{
			//System.out.println(prod);
		});
		
		prodDao.getProductsV3_U1(50000).forEach(prod->{
			//System.out.println(prod);
		});
		
		prodDao.getProductsV3_U2("%a%").forEach(prod->{
			//System.out.println(prod);
		});
		
		prodDao.getProductsV3_U3("%a%",2000).forEach(prod->{
			//System.out.println(prod);
		});
		
		//prodDao.getProductsV4_U1(50000);
		
		
		List<Product> prods;
		
		Product p1=new Product();
		p1.setId("P011");
		p1.setName("Ear Pods");
		p1.setPrice(4500);
		p1.setDescription("Sony");
		
		Product prodObj = prodDao.save(p1); 
		if(prodObj!=null) {
			System.out.println("record inserted");
		}else {
			System.out.println("issue while saving record to db");
		}


	}

}

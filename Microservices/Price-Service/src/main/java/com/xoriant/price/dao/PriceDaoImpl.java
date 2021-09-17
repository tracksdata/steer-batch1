package com.xoriant.price.dao;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.price.dao.utils.DbQueries;
import com.xoriant.price.model.Product;

@Repository
public class PriceDaoImpl implements PriceDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Product getProductPrice(int productId) {

		return jdbcTemplate.query(DbQueries.FIND_PRODUCT_PRICE, (ResultSet rs) -> {

			Product product = new Product();

			if (rs.next()) {
				product.setProductId(rs.getInt("product_id"));
				product.setPrice(rs.getInt("product_price"));
				product.setTitle(rs.getString("product_title"));

			} else {
				return null;
			}
			return product;
		}, productId);
	}

}

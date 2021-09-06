package com.xoraint.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xoraint.product.model.Product;

@Repository
public class ProductDaoImpl {

	private JdbcTemplate jt;

	@Autowired
	public ProductDaoImpl(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}

	// Single row operations

	public long getTableRowsCount() {
		String q1 = "select count(*) from product";
		return jt.queryForObject(q1, Long.class);
	}

	// query for MAP // single row
	public Map<String, Object> getProductsV1() {
		String q1 = "select * from product where id='P005'";
		return jt.queryForMap(q1);
	}

	// query for List // multiple rows
	public List<Map<String, Object>> getProductsV2() {
		String q1 = "select * from product";
		return jt.queryForList(q1);
	}

	// Multi-row operations
	// Domain Object Queries
	/*
	 * Domain Objects ---------------- 
	 * 1. RowMapper interface : for single record of Domain Object 
	 * 		-> mapRow 
	 * 2. RowCallbackHandler interface 
	 * 		-> void processRow 
	 * 3.ResultsetExtractor interface 
	 * 		-> extractData
	 * 
	 */

	// 1. RowMapper interface

	public List<Product> getProductsV3() {
		List<Product> prod = jt.queryForObject("select * from product", new RowMapperImpl());
		return prod;
	}

}

class RowMapperImpl implements RowMapper<List<Product>> {
	public List<Product> mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		List<Product> prods = new ArrayList<Product>();
		
		while (rs.next()) {
			Product prod = new Product();
			prod.setId(rs.getString("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));
			prod.setDescription(rs.getString("description"));
			prods.add(prod);
		}
		return prods;
	}
}

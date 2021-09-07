package com.xoraint.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

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
	 * Domain Objects
	 * ---------------- 
	 * 1. RowMapper interface : for single record of Domain Object 
	 * 		-> mapRow 
	 * 2. RowCallbackHandler interface 
	 * 		-> void processRow 
	 * 3.ResultsetExtractor interface 
	 * 		-> extractData
	 */

	// 1. RowMapper interface
	public List<Product> getProductsV3() {
		List<Product> prods = jt.query("select * from product", new RowMapperImpl());
		return prods;
	}
	
	// 1. RowMapper interface
		public List<Product> getProductsV3_U1(double price) {
			List<Product> prods = jt.query("select * from product where price>=?", new RowMapperImpl(),price);
			return prods;
		}
		
		
		public List<Product> getProductsV3_U2(String name) {
			List<Product> prods = jt.query("select * from product where name like ?", new RowMapperImpl(),name);
			return prods;
		}
		
		public List<Product> getProductsV3_U3(String name,double price) {
			List<Product> prods = jt.query("select * from product where name like ? and price>=?", new RowMapperImpl(),name,price);
			return prods;
		}
		
	
	//2. RowCallbackHandler interface 
	
	public void getProductsV4() {
		jt.query("select * from product",new RowCallBackHandlerImpl());
	}
	
	public void getProductsV4_U1(double price) {
		jt.query("select * from product where price>=?",new RowCallBackHandlerImpl(),price);
	}
	
	
	//3.ResultsetExtractor interface 
	@Transactional(isolation = Isolation.READ_COMMITTED)
	public List<Product> getProductsV5(){
		return jt.query("select * from product", new ResultsetExtractorImpl());
	}
	
	
	public Product save(Product prod) {
		String q1="insert into product values(?,?,?,?)";
		int x=jt.update(q1,prod.getId(),prod.getName(),prod.getPrice(),prod.getDescription());
		if(x!=0) {
			return prod;
		}
		return null;
	}
	
	
	
	/*
	 * Summary
	 * ===================
	 * • RowMapper
			– Best choice when each row of a ResultSet maps to a domain object
	   • RowCallbackHandler
			– Best choice when no value should be returned from the callback method for each row, especially large queries
	   • ResultSetExtractor
			– Best choice when multiple rows of a ResultSet map to a single object
	 
	 * 
	 */
	
	

}

class ResultsetExtractorImpl implements ResultSetExtractor<List<Product>>{
	private List<Product> prods=new ArrayList<>();
	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		while(rs.next()) {
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

class RowCallBackHandlerImpl implements RowCallbackHandler{
	@Override
	public void processRow(ResultSet rs) throws SQLException {
		while(rs.next()) {
			System.out.println("ID: "+rs.getString("id"));
			System.out.println("Name: "+rs.getString("name"));
			System.out.println("Price: "+rs.getDouble("price"));
			System.out.println("Description: "+rs.getString("description"));
			System.out.println("------------------------------------------------");
		}
		
	}
}

class RowMapperImpl implements RowMapper<Product> {
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Product prod = new Product();
			prod.setId(rs.getString("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));
			prod.setDescription(rs.getString("description"));
			
		return prod;
	}
}

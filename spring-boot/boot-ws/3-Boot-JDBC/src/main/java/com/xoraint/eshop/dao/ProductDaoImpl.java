package com.xoraint.eshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xoraint.eshop.entity.Product;

@Repository
public class ProductDaoImpl {
	@Autowired
	private JdbcTemplate jt;
	
	public List<Product> findAll(){
		
		return jt.query("select * from product", new ResultsetExtractorImpl());
	}

}

class ResultsetExtractorImpl implements ResultSetExtractor<List<Product>>{
	
	List<Product> prods=new ArrayList<>();
	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		while(rs.next()) {
			Product prod=new Product();
			prod.setId(rs.getString("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));
			prod.setDescription(rs.getString("description"));
			
			prods.add(prod);
		}
	
		return prods;
	}
}

package com.xoraint.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.xoraint.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private JdbcTemplate jt;

	@Autowired
	public ProductDaoImpl(DataSource ds) {
		jt = new JdbcTemplate(ds);
	}

	@Override
	public void save(Product product) {
		String q1 = "insert into product values(?,?,?,?)";
		jt.update(q1, product.getId(), product.getName(), product.getPrice(), product.getDescription());
	}

	// find a Single Record using id
	@Override
	public Product findById(String id) {
		String q1 = "select * from product where id=?";
		return jt.queryForObject(q1, new RowMapperImpl(), id);
	}

	// find all products from product table as java.util.list interface
	@Override
	public List<Product> listProducts() {
		return jt.query("select * from product", new ResultsetExtractorImpl());
	}
}

class RowMapperImpl implements RowMapper<Product> {
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product prod = new Product();
		prod.setId(rs.getString("id"));
		prod.setName(rs.getString("name"));
		prod.setPrice(rs.getDouble("price"));
		prod.setDescription(rs.getString("description"));

		return prod;
	}
}

class ResultsetExtractorImpl implements ResultSetExtractor<List<Product>> {
	List<Product> prods = new ArrayList<>();

	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
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

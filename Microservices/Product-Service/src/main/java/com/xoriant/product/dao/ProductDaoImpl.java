package com.xoriant.product.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.product.dao.utils.DbQueries;
import com.xoriant.product.model.Brand;
import com.xoriant.product.model.Category;
import com.xoriant.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Product save(Product product) {
		jdbcTemplate.update(DbQueries.SAVE_NEW_PRODUCT,product.getProductId(),product.getCategory().getCategoryId(),product.getBrand().getBrandId(),product.getTitle(),product.getPrice(),product.getQty(),product.getDescription(),product.getImagePath(),product.getKeywords());
		return product;
	}

	// find Product by product ID
	 @Override
	public Product findById(int productId) {
		return jdbcTemplate.query(DbQueries.FIND_PRODUCT_BY_PRODUCTID, (ResultSet rs) -> {

			Product product = new Product();

			if (rs.next()) {

				Category category = new Category();
				Brand brand = new Brand();
				
				category.setCategoryId(rs.getInt("cat_id"));
				category.setTitle(rs.getString("cat_title"));
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setTitle(rs.getString("brand_title"));

				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQty(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));

				product.setCategory(category);
				product.setBrand(brand);

			} else {
				return null;
			}
			return product;
		}, productId);
	}

	// find all brand names
	@Override
	public List<Brand> findAllBrands() {

		return jdbcTemplate.query(DbQueries.FIND_BRAND_NAMES, (ResultSet rs) -> {
			List<Brand> brandList = new ArrayList<Brand>();
			System.out.println(">>>>>>>>>>> LISTING ALL PRODUCTS - METHOD <<<<<<<<<<<");

			while (rs.next()) {
				System.out.println(">>>>>>>>>>> LISTING ALL PRODUCTS <<<<<<<<<<<");
				
				Brand brand = new Brand();
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setTitle(rs.getString("brand_title"));

				brandList.add(brand);
			}
			return brandList;
		});
	}

	// filter products by brand
	@Override
	public List<Product> filterProductsByBrandName(String brandName) {
		return jdbcTemplate.query(DbQueries.FILTER_PRODUCTS_BY_BRAND, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQty(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, brandName);
	}

	// filter products by Price max and min range
	@Override
	public List<Product> filterProductsByMaxPriceRange(int maxPrice) {
		return jdbcTemplate.query(DbQueries.FILTER_PRICE_MAX_RANGE, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQty(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, maxPrice);
	}

// filter products by Price max and min range
	@Override
	public List<Product> filterProductsByMinAndMaxRange(int minPrice, int maxPrice) {
		return jdbcTemplate.query(DbQueries.FILTER_PRODUCTS_BY_PRICE, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQty(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, minPrice, maxPrice);
	}

	// Find all products
	@Override
	public List<Product> findAll() {
		return jdbcTemplate.query(DbQueries.FIND_ALL_PRODUCTS, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				Category category = new Category();
				Brand brand = new Brand();

				category.setCategoryId(rs.getInt("cat_id"));
				category.setTitle(rs.getString("cat_title"));
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setTitle(rs.getString("brand_title"));

				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQty(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				product.setCategory(category);
				product.setBrand(brand);

				productList.add(product);
			}
			return productList;
		});
	}

	// fetch products by catagoryId
	@Override
	public List<Product> getProductByCategory(int catagoryId) {
		return jdbcTemplate.query(DbQueries.FIND_PROODUCTS_BY_CATEGORY, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				Category category = new Category();
				Brand brand = new Brand();

				category.setCategoryId(rs.getInt("cat_id"));
				category.setTitle(rs.getString("cat_title"));
				brand.setBrandId(rs.getInt("brand_id"));
				brand.setTitle(rs.getString("brand_title"));

				product.setProductId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImagePath(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQty(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				product.setCategory(category);
				product.setBrand(brand);

				productList.add(product);
			}
			return productList;
		},catagoryId);
	}
}

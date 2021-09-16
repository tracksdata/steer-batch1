package com.xoriant.product.model;

public class Product {

	private int productId;
	private String title;
	private double price;
	private int qty;
	private String description;
	private String imagePath;
	private String keywords;

	private Category category;
	private Brand brand;

	public Product(int productId, String title, double price, int qty, String description, String imagePath,
			String keywords, Category category, Brand brand) {
		super();
		this.productId = productId;
		this.title = title;
		this.price = price;
		this.qty = qty;
		this.description = description;
		this.imagePath = imagePath;
		this.keywords = keywords;
		this.category = category;
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Product() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", brand=" + brand + ", title=" + title
				+ ", price=" + price + ", qty=" + qty + ", description=" + description + ", imagePath=" + imagePath
				+ ", keywords=" + keywords + "]";
	}

}

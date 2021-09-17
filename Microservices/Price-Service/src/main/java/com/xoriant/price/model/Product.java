package com.xoriant.price.model;

public class Product {

	private int productId;
	private String title;
	private double price;

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

	@Override
	public String toString() {
		return "Product - Price:: [productId=" + productId + ", title=" + title + ", price=" + price + "]";
	}
	
	
	

}

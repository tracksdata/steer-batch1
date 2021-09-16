package com.xoriant.product.model;

public class Category {

	private int categoryId;
	private String title;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Category(int categoryId, String title) {
		super();
		this.categoryId = categoryId;
		this.title = title;
	}



	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", title=" + title + "]";
	}
	
	

}

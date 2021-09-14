package com.xoriant.ecart.entities;

public class Cart {

	private String itemid;
	private String itemName;
	private double total;
	private double itemPrice;
	private int quantity;

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [itemid=" + itemid + ", itemName=" + itemName + ", total=" + total + ", itemPrice=" + itemPrice
				+ ", quantity=" + quantity + "]";
	}
	
	

}

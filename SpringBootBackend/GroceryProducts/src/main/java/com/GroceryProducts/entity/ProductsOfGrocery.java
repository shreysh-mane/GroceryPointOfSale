package com.GroceryProducts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsOfGrocery {
	@Id
	private int ids;
    private String name;
	private String type;
	private int price;
	private int quantity;
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

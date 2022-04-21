package com.GroceryProducts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductsOfGrocery {
	@Id
	private long ids;
    private String name;
	private String type;
	private int price;
	private int quantity;
	

}

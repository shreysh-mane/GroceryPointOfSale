package com.GroceryProducts.service;

import java.util.List;

import com.GroceryProducts.entity.ProductsOfGrocery;

public interface ProductServicesInterface {

	int addProduct(ProductsOfGrocery pd);

	List showProduct();

	int updateProduct(ProductsOfGrocery pd);

	void deleteProduct(ProductsOfGrocery pd);

}

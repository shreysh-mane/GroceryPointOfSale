package com.GroceryProducts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.GroceryProducts.dao.productDAOREP;
import com.GroceryProducts.entity.ProductsOfGrocery;
@Service
@Transactional
public class ProductServices implements ProductServicesInterface{
	
	
	@Autowired
	private productDAOREP pdr;

	@Override
	public int addProduct(ProductsOfGrocery pd) {
		pdr.save(pd);
		return 1;
	}

	@Override
	public List showProduct() {
		// TODO Auto-generated method stub
		return pdr.findAll();
	}

	@Override
	public int updateProduct(ProductsOfGrocery pd) {
		pdr.saveAndFlush(pd);
		return 1;
	}

	@Override
	public void deleteProduct(ProductsOfGrocery pd) {
		pdr.delete(pd);
	}

}

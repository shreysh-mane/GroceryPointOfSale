package com.GroceryProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroceryProducts.entity.ProductsOfGrocery;
@Repository
public interface productDAOREP extends JpaRepository<ProductsOfGrocery, Long> {

}

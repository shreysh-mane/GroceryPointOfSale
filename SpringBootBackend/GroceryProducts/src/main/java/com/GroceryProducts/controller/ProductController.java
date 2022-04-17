package com.GroceryProducts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GroceryProducts.entity.ProductsOfGrocery;
import com.GroceryProducts.service.ProductServicesInterface;



@RestController
@RequestMapping("/api/product")
@CrossOrigin("http://localhost:9002")
// http://localhost:9002/grocery/api/product
public class ProductController {
	
	
	@Autowired
	private ProductServicesInterface psi;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody ProductsOfGrocery pd) {
		int i=psi.addProduct(pd);
		if(i>0) {
			return "product is added";
		}
		else {
			return "product added fails";
		}
	}
	
	
	@GetMapping("/show")
	public List<ProductsOfGrocery> showProduct(){
		List ll=psi.showProduct();
		return ll;
		
	}

	
	@PutMapping("/update/{pid}")
	public String updateProduct(@PathVariable("pid") long ids,@RequestBody ProductsOfGrocery pd) {
		pd.setIds(ids);
		int i=psi.updateProduct(pd);
		return "update product details";
	}

	
	@DeleteMapping("/delete/{sid}")
	public String deleteProduct(@PathVariable("sid") long ids) {
		ProductsOfGrocery pd=new ProductsOfGrocery();
		pd.setIds(ids);
		psi.deleteProduct(pd);
		return "product is deleted";
	}

}

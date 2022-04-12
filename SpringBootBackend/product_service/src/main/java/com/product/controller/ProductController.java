package com.product.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	
	@GetMapping("/getproduct/{id}")
	public String getStaffController(@PathVariable(value ="id") Long prodId) {
		System.out.println("add to cart");
		return "hello";
		
	}
}

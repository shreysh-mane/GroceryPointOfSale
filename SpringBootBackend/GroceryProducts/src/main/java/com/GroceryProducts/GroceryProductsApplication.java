package com.GroceryProducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GroceryProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryProductsApplication.class, args);
		System.out.println("product service");
	}

}

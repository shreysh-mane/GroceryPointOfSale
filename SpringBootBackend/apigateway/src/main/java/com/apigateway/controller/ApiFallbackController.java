package com.apigateway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ApiFallbackController {

	
		@GetMapping("/staffServiceFallBack")
	    public String userServiceFallBackMethod() {
	        return "staff Service is taking longer than Expected." +
	                " Please try again later";
	    }

	    @GetMapping("/productServiceFallBack")
	    public String productServiceFallBackMethod() {
	        return "product Service is taking longer than Expected." +
	                " Please try again later";
	    }
	    
	    
	    @GetMapping("/loginServiceFallBack")
	    public String loginServiceFallBackMethod() {
	        return "login Service is taking longer than Expected." +
	                " Please try again later";
	    }
}

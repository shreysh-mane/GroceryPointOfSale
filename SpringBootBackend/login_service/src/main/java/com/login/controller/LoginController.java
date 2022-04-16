package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.Staff;
import com.login.service.LoginServiceInterface;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired LoginServiceInterface LoginService;
	
	@PostMapping("")
	public String loginController(@RequestBody Staff loginUser) {
		
		return LoginService.loginService(loginUser);
		

	}
	
}

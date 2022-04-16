package com.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.Staff;
import com.login.repository.LoginRepository;

@Service
public class LoginService implements LoginServiceInterface{
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public String loginService(Staff loginUser) {
		
		
		
		loginRepository.save(loginUser);
		
		 
		
		Optional<Staff>loginUser1= Optional.ofNullable(loginRepository.findByIdandMobile(loginUser.getEmail(),loginUser.getMobile()));
		 
		 if(loginUser1.isPresent()) {
			 String role=loginUser1.get().getRole();
			 if(role.equals("admin")) {
				 return "admin";
				 
			 }else {
				 return "staff";
			 }
		 }else {
			 return "faild";
		 }
		 
	}

}

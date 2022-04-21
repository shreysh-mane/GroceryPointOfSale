package com.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.login.entity.Staff;
import com.login.repository.LoginRepository;

@Service
public class LoginService implements LoginServiceInterface{
	
	@Autowired
	private LoginRepository loginRepository;
	
	   @Autowired
	   private JavaMailSender mailSender;
	
	@Override
	public String loginService(Staff loginUser) {
		
		
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

	@Override
	public String forgetPassService(Staff loginUser) {
		
		Optional<Staff>loginUser1= loginRepository.findById(loginUser.getEmail());
		if(loginUser1.isPresent()) {
			 Long pass=loginUser1.get().getMobile();
			 
			 
		      SimpleMailMessage message = new SimpleMailMessage();

		        message.setFrom("spring.sendmail94@gmail.com");
		        message.setTo(loginUser.getEmail());
		        message.setText("Your password is : "+ pass);
		        message.setSubject("Forget Password Request");

		        mailSender.send(message);
		        System.out.println("Mail Send...");
			 
			 
			 
		 }else {
			 return "faild";
		 }
		
		
		return "sent";
	}

}

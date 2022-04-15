package com.staff.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.staff.Entity.StaffEntity;
import com.staff.interfaces.StaffServiceInterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/staff")
public class Staffcontroller {
	
	

	@Autowired
	private StaffServiceInterface staffServiceInterface;
	@Autowired
	private RestTemplate restTemplate;
		
	@PostMapping("/addstaff")
	public String addStaffcontroller(@RequestBody StaffEntity StaffUser) {
		
		String result =  staffServiceInterface.addStaff(StaffUser);
		return "1";
		
	}
	
	@GetMapping("getstaff/{id}")
	public ResponseEntity<String> getStaffController(@PathVariable(value ="id") Long staffId) {
	
		ResponseEntity<String> result1 = restTemplate.getForEntity("http://product-service/grocery/api/product/getproduct/1", String.class);
		return result1;
		
		
	}
}

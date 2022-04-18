package com.Grocery.controller;


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


import com.Grocery.entity.Staff;
import com.Grocery.service.AdminServiceInterface;
@RestController
@RequestMapping("/api/staff")
@CrossOrigin("*")
public class AdminController {
	@Autowired
	private AdminServiceInterface asi;
	
	
	
	//staff
	@PostMapping("addstaff")
	public String AddStaff(@RequestBody Staff sf) {
		sf.setRole("staff");
		System.out.print(sf.getEmail());
		int i=asi.AddStaff(sf);
		if(i>0) {
			return "staff is added sucessfuly";
		}
		else {
			return "adding staff fails";
		}
	}
	
	
	@GetMapping("showStaff")
	public List<Staff> showStaff(){
		List<Staff> ll=asi.showStaffservice();
		return ll;
		
	}
	@PutMapping("updateStaff/{sid}")
	public String updateStaff(@PathVariable("sid") String email,@RequestBody Staff sf) {
		sf.setRole("staff");
		sf.setEmail(email);
		int i=asi.updateStaff(sf);
		return "update staff details";
	}
	@DeleteMapping("staffdelete/{sid}")

	public String deleteStaff(@PathVariable("sid") String email) {
		Staff s=new Staff();
		s.setEmail(email);
		asi.deletestaff(s);
		return "staff deleted";
	}
	

}

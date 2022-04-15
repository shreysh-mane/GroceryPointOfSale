package com.Grocery.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Grocery.dao.AdminDaoInterface;

import com.Grocery.entity.Staff;




@Service
@Transactional
public class AdminService implements AdminServiceInterface {
	@Autowired
	private AdminDaoInterface adi;


	@Override
	public int AddStaff(Staff sf) {
		adi.save(sf);
		return 1;
	}

	@Override
	public List<Staff> showStaffservice() {
		
		return adi.findAll();
	}



	@Override
	public int updateStaff(Staff sf) {
		adi.saveAndFlush(sf);
		
		return 1;
	}



	@Override
	public void deletestaff(Staff s) {
		adi.delete(s);
	}



}

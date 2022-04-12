package com.staff.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.Entity.StaffEntity;
import com.staff.interfaces.StaffServiceInterface;
import com.staff.repository.StaffRepositoryInterface;

@Service
@Transactional
public class StaffService implements StaffServiceInterface {

	@Autowired
	StaffRepositoryInterface staffRepositoryInterface;

	@Override
	public String addStaff(StaffEntity staffUser) {
		staffRepositoryInterface.save(staffUser);
		return "Done";
	}

	@Override
	public StaffEntity getStaffService(Long staffId) {
		Optional<StaffEntity> staff=staffRepositoryInterface.findById(staffId);
		return staff.get();
	}
	
	
	
}

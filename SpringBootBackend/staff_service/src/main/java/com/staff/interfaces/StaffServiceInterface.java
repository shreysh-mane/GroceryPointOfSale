package com.staff.interfaces;

import com.staff.Entity.StaffEntity;

public interface StaffServiceInterface {

	String addStaff(StaffEntity staffUser);

	StaffEntity getStaffService(Long staffId);

}

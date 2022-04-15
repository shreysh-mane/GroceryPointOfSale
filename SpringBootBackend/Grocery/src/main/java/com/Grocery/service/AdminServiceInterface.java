package com.Grocery.service;

import java.util.List;

import com.Grocery.entity.Staff;

public interface AdminServiceInterface {

	int AddStaff(Staff sf);

	List<Staff> showStaffservice();

//	int AddProduct(Product pd);
//
//	List<Product> showproduct();

	int updateStaff(Staff sf);

//	int updateProduct(Product pd);

	void deletestaff(Staff s);

//	void deleteProduct(Product pd);

}

package com.Grocery.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Grocery.entity.Staff;
@Repository
public interface AdminDaoInterface  extends JpaRepository<Staff, String>{
	

}

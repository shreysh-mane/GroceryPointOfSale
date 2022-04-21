package com.ProducerGroceryPOS.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProducerGroceryPOS.Entity.ProducerGrocery;
import com.ProducerGroceryPOS.Repository.ProducerStaffRepository;

@Service
@Transactional
public class ProducerStaffService  {
	
	@Autowired
	private ProducerStaffRepository staffRepository;
	
	

	public ProducerGrocery saveUser(ProducerGrocery user) {
		
		return staffRepository.save(user);
	}



	public ProducerGrocery getuserByphnum(long phnum) {
		
		return staffRepository.getByphnum(phnum);
	}



	public List<ProducerGrocery> viewAllCustomers() {
		
		return staffRepository.findAll();
	}



	public int deleteuserByphnum(long phnum) {
		
		return staffRepository.deleteByphnum(phnum);
	}



	public ProducerGrocery updateuserByphnum(ProducerGrocery producergrocery) {
		
		return staffRepository.saveAndFlush(producergrocery);
	}



	public Integer updateuserByphnum(String name, int numOfProducts) {
		
		return staffRepository.saveAndFlush(name,numOfProducts);
	}



	public ProducerGrocery fetchUserByPhnum(long tempphnum) {
		
		return staffRepository.fetchUserByPhnum(tempphnum);
	}



	public int updatecount(long newcount, long tempphnum) {
		
		return staffRepository.update(newcount,tempphnum);
	}



	public int updateuserByphnum(String name, long numofproducts,long phnum) {
		
		return staffRepository.updateByphnum(name,numofproducts,phnum);
	}



	public int updateuserByEmail(String name, long numofproducts, String email) {
		
		return staffRepository.updateByEmail(name,numofproducts,email);
	}



	


//	public ProducerGrocery updateuserByphnum(long phnum,String name,int numOfProducts, String email) {
//		
//		return staffRepository.updateByEmail( phnum,name, numOfProducts, email);
//	}






}

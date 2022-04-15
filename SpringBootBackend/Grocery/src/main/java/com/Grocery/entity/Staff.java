package com.Grocery.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Staff {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Long getAccount() {
		return account;
	}
	public void setAccount(Long account) {
		this.account = account;
	}
	public Long getAddhar() {
		return addhar;
	}
	public void setAddhar(Long addhar) {
		this.addhar = addhar;
	}

	private String name;
	
	@Id
	private String email;
	private String state;
	private Long mobile;
	private Long account;
	private Long addhar;
	
	
	

}

package com.login.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
public class Staff {
	@Id
	private String email;
	private String state;
	private Long mobile;
	private Long account;
	private Long addhar;
	private String role;
}

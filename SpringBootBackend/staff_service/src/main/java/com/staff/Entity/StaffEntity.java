package com.staff.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Entity
public class StaffEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long staffid;
	private String staffName;
}

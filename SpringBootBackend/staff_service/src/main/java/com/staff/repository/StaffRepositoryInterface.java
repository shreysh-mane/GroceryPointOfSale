package com.staff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staff.Entity.StaffEntity;

@Repository
public interface StaffRepositoryInterface extends JpaRepository<StaffEntity, Long> {

}

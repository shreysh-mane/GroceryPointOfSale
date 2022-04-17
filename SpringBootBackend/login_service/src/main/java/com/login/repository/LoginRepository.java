package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.login.entity.Staff;
@Repository
public interface LoginRepository extends  JpaRepository<Staff,String> {
	
	@Query("from com.login.entity.Staff st where st.email=:email and st.mobile=:mobile")
	Staff findByIdandMobile(@Param("email")String email,@Param("mobile") Long mobile);

}

package com.ProducerGroceryPOS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ProducerGroceryPOS.Entity.ProducerGrocery;

@Repository
public interface ProducerStaffRepository extends JpaRepository<ProducerGrocery, Integer>{

	@Query("from com.ProducerGroceryPOS.Entity.ProducerGrocery pg where pg.phnum=:phnum")
	public ProducerGrocery getByphnum(@Param("phnum") long phnum);

	@Modifying
	@Transactional
	@Query("Delete from com.ProducerGroceryPOS.Entity.ProducerGrocery pg where pg.phnum=:phnum")
	public int deleteByphnum(@Param("phnum") long phnum);

	@Query("Update from com.ProducerGroceryPOS.Entity.ProducerGrocery pg set pg.name=:name,pg.numOfProducts=:numOfProducts where pg.phnum=:phnum")
	public Integer saveAndFlush(@Param("name") String name,@Param("numOfProducts") int numOfProducts);

	@Query("from com.ProducerGroceryPOS.Entity.ProducerGrocery pg where pg.phnum=:phnum")
	public ProducerGrocery fetchUserByPhnum(@Param("phnum") long tempphnum);

	@Modifying
	@Query("Update from com.ProducerGroceryPOS.Entity.ProducerGrocery pg set pg.purchasecount=:newcount where pg.phnum=:tempphnum")
	public int update(@Param("newcount") long newcount,@Param("tempphnum") long tempphnum);

	@Modifying
	@Query("Update from com.ProducerGroceryPOS.Entity.ProducerGrocery pg set pg.name=:name,pg.numOfProducts=:numofproducts where pg.phnum=:phnum")
	public int updateByphnum(@Param("name") String name,@Param("numofproducts") long numofproducts,@Param("phnum") long phnum);

	@Modifying
	@Query("Update from com.ProducerGroceryPOS.Entity.ProducerGrocery pg set pg.name=:name,pg.numOfProducts=:numofproducts where pg.email=:email")
	public int updateByEmail(String name, long numofproducts, String email);

	
//	@Query("update from com.ProducerGroceryPOS.Entity.ProducerGrocery pg set pg.name=:name,pg.numOfProducts=:numOfProducts where pg.phnum=:phnum")
//	public int updateByphnum(@Param("name") String name,@Param("numOfProducts") int numOfProducts,@Param("phnum") long phnum);
	
	
//	@Query("update from com.ProducerGroceryPOS.Entity.ProducerGrocery pg set pg.phnum=:phnum,pg.name=:name,pg.numOfProducts=:numOfProducts where pg.email=:email")
//	public ProducerGrocery updateByEmail(@Param("phnum") long phnum,@Param("name") String name,@Param("numOfProducts") int numOfProducts,@Param("email") String email);
	

}

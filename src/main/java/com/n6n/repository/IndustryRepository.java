package com.n6n.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.n6n.entity.IndustryEntity;


public interface IndustryRepository extends JpaRepository<IndustryEntity, String>{
	
	
	 @Query("SELECT i FROM IndustryEntity i WHERE i.isActive = 'A'")
	  List<IndustryEntity> findAllActiveIndustry();


}

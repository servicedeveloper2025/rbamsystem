package com.n6n.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.n6n.entity.FormEntity;


public interface FormRepository extends JpaRepository<FormEntity, Long>{
	
	
	 @Query("SELECT f FROM FormEntity f WHERE f.isActive = 'A'")
	    List<FormEntity> findAllActiveForm();


}

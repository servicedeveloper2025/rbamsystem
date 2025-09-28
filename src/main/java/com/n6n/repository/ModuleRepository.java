package com.n6n.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.n6n.entity.ModuleEntity;


public interface ModuleRepository extends JpaRepository<ModuleEntity, Long>{
	
	
	 @Query("SELECT m FROM ModuleEntity m WHERE m.isActive = 'A'")
	    List<ModuleEntity> findAllActiveModules();


}

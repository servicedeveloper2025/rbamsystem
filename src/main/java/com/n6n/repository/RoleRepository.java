package com.n6n.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.n6n.entity.RoleEntity;


public interface RoleRepository extends JpaRepository<RoleEntity, String>{
	
	 @Query("SELECT r FROM RoleEntity r WHERE r.isActive = 'A'")
	  List<RoleEntity> findAllActiveRole();



}

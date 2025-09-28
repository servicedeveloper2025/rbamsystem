package com.n6n.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.n6n.entity.CustEntity;
import com.n6n.entity.RoleEntity;


public interface CustRepository extends JpaRepository<CustEntity, Long>{
	
	
	List<CustEntity> findByIc(String ic);


}

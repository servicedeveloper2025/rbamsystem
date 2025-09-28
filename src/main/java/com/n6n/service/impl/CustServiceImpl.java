package com.n6n.service.impl;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n6n.entity.CustEntity;
import com.n6n.repository.CustRepository;
import com.n6n.request.CustRequestVO;
import com.n6n.service.CustService;

@Service
public class CustServiceImpl implements CustService{
	
	@Autowired
	CustRepository custRepository;

 public String getAppointment(CustRequestVO reqvo)
 {
	 System.out.println("---------------ok-------------");
	 CustEntity custEntity = new CustEntity();
	// custEntity.setId(12345);
	 custEntity.setEmail(reqvo.getEmail());
	 custEntity.setIc(reqvo.getIcNumber());
	 custEntity.setPh(reqvo.getPh());
	 custEntity.setCustomerName(reqvo.getCustomerName());
	 
	 //custRepository.save(custEntity);
	 return "success";
 }
 
 

 
 public String confirmAppointment(CustRequestVO reqvo)
 {
	 System.out.println("---------------ok-------------");
	 custRepository.findByIc(null);
	 CustEntity custEntity = new CustEntity();
	// custEntity.setId(12345);
	 custEntity.setEmail(reqvo.getEmail());
	 custEntity.setIc(reqvo.getIcNumber());
	 custEntity.setPh(reqvo.getPh());
	 custEntity.setCustomerName(reqvo.getCustomerName());
	 
	 //custRepository.save(custEntity);
	 return "success";
 }
}

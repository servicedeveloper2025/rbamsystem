package com.n6n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n6n.request.CustRequestVO;
import com.n6n.service.CustService;

@RestController
@RequestMapping("/com/n6n")
public class CustController {
	
@Autowired
private CustService custService;

	
@PostMapping("/cust")
public String getAppointment(@RequestBody CustRequestVO cust)
{
	String res = custService.getAppointment(cust);
	System.out.println("ok--------------------");
	
	return res;
}

@PostMapping("/cust/ic")
public String confirmAppointment(@RequestBody CustRequestVO cust)
{
	String res = custService.getAppointment(cust);
	System.out.println("ok--------------------");
	
	return res;
}

}

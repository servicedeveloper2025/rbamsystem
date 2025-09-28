package com.n6n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n6n.response.RoleFormResponseVO;
import com.n6n.service.RoleFormService;

@RestController
@RequestMapping("/com/n6n")
@CrossOrigin(origins = "*")  
public class RoleFormController {
	
@Autowired
private RoleFormService roleFormService;

	


@GetMapping("/addrole")

public RoleFormResponseVO getRoleFormDetails()
{
	RoleFormResponseVO res = roleFormService.getRoleFormDetails();
	System.out.println("ok--------------------");
	
	return res;
}

}

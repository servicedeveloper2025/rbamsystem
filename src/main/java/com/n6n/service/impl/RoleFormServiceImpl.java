package com.n6n.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n6n.entity.FormEntity;
import com.n6n.entity.IndustryEntity;
import com.n6n.entity.ModuleEntity;
import com.n6n.entity.RoleEntity;
import com.n6n.repository.FormRepository;
import com.n6n.repository.IndustryRepository;
import com.n6n.repository.ModuleRepository;
import com.n6n.repository.RoleRepository;
import com.n6n.response.RoleFormResponseVO;
import com.n6n.service.RoleFormService;
import com.n6n.vo.FormVO;
import com.n6n.vo.IndustryVO;
import com.n6n.vo.ModuleVO;
import com.n6n.vo.RoleVO;
@Service
public class RoleFormServiceImpl implements RoleFormService {

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	IndustryRepository industryRepository;
	
	@Autowired
	FormRepository formRepository;

	public RoleFormResponseVO getRoleFormDetails() {
		RoleFormResponseVO roleFormResponseVO = new RoleFormResponseVO();

		List<IndustryVO> industryListVO = new ArrayList<IndustryVO>();
		List<RoleVO> roleListVO = new ArrayList<RoleVO>();
		List<FormVO> formListVO = new ArrayList<FormVO>();

		List<RoleEntity> rolelist = roleRepository.findAllActiveRole();
		List<IndustryEntity> industryList = industryRepository.findAllActiveIndustry();
		List<FormEntity> formList = formRepository.findAllActiveForm();

		
		
		
		rolelist.forEach(role ->

		{
			RoleVO roleVO = new RoleVO();
			roleVO.setRoleId(role.getOrgId());
			roleVO.setRoleName(role.getRoleName());
			roleListVO.add(roleVO);

		});

		industryList.forEach(industry ->

		{
			
			IndustryVO industryVO = new IndustryVO();
			industryVO.setIndustryId(industry.getIndustryId());
			industryVO.setIndustryName(industry.getIndustryName());
			industryVO.setDescription(industry.getDescription());
			industryListVO.add(industryVO);

		});

		formList.forEach(form ->

		{
			FormVO formVO = new FormVO();
			formVO.setFormId(form.getFormId());
			formVO.setFormName(form.getFormName());
			formListVO.add(formVO);

		});
		
		roleFormResponseVO.setIndustryList(industryListVO);
		roleFormResponseVO.setRoleList(roleListVO);
		roleFormResponseVO.setFormList(formListVO);
		return roleFormResponseVO;
	}

}

package com.n6n.response;

import java.util.List;

import com.n6n.vo.FormVO;
import com.n6n.vo.IndustryVO;
import com.n6n.vo.RoleVO;

public class RoleFormResponseVO {

	private List<RoleVO> roleList;
	private List<IndustryVO> industryList;
	private List<FormVO> formList;
	public List<RoleVO> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<RoleVO> roleList) {
		this.roleList = roleList;
	}
	public List<IndustryVO> getIndustryList() {
		return industryList;
	}
	public void setIndustryList(List<IndustryVO> industryList) {
		this.industryList = industryList;
	}
	public List<FormVO> getFormList() {
		return formList;
	}
	public void setFormList(List<FormVO> formList) {
		this.formList = formList;
	}

	

}

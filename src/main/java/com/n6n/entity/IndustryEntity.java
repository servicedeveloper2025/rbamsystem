package com.n6n.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "n6n", name = "industry")

public class IndustryEntity {

	@Id
	@Column(name = "industry_id")
	private String industryId;

	@Column(name = "industry_name")
	private String industryName;

	@Column(name = "isactive")
	private String isActive;
	
	@Column(name = "description")
	private String description;

	public String getIndustryId() {
		return industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}

package com.n6n.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(schema ="n6n" ,name= "module")


public class ModuleEntity {
	
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	 @Column(name = "org_id")
    private String orgId;
	 @Column(name = "module_id")
    private String moduleId;
	 @Column(name = "name")
    private String ModuleName;
	 @Column(name = "isactive")
    private String isActive;
	 @Column(name = "description")
    private String moduleDescription;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getModuleDescription() {
		return moduleDescription;
	}
	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}
	

}

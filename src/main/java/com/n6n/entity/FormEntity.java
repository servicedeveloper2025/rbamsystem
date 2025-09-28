package com.n6n.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(schema ="n6n" ,name= "form")


public class FormEntity {
	
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	 @Column(name = "form_id")
    private String formId;
	 @Column(name = "form_name")
    private String formName;

	 @Column(name = "isactive")
    private String isActive;
	 @Column(name = "description")
    private String formDescription;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getFormDescription() {
		return formDescription;
	}
	public void setFormDescription(String formDescription) {
		this.formDescription = formDescription;
	}
	
	 

}

package com.n6n.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(schema ="n6n" ,name= "cust_prof")


public class CustEntity {
	
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	 @Column(name = "ic")
    private String ic;
    private String customerName;
    private String customerSurname;
    private Date dob;
    private String email;
    private long ph;
    private long ph2;
    private String gender;
    private long age;
    private String mir_no;
    private String address; 
    private String description;
    
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getIc() {
		return ic;
	}
	public void setIc(String ic) {
		this.ic = ic;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public long getPh2() {
		return ph2;
	}
	public void setPh2(long ph2) {
		this.ph2 = ph2;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getMir_no() {
		return mir_no;
	}
	public void setMir_no(String mir_no) {
		this.mir_no = mir_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    

}

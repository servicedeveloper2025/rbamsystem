package com.n6n.request;

import java.util.Date;

public class CustRequestVO {

    private String icNumber;
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
	public String getIcNumber() {
		return icNumber;
	}
	public void setIcNumber(String icNumber) {
		this.icNumber = icNumber;
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
	@Override
	public String toString() {
		return "Customer [icNumber=" + icNumber + ", customerName=" + customerName + ", customerSurname="
				+ customerSurname + ", dob=" + dob + ", email=" + email + ", ph=" + ph + ", ph2=" + ph2 + ", gender="
				+ gender + ", age=" + age + ", mir_no=" + mir_no + ", address=" + address + ", description="
				+ description + "]";
	} 
    
    
    
    
    
}

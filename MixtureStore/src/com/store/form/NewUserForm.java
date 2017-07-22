package com.store.form;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class NewUserForm {

	private String name;
	private String password;
	private String shopName;
	private String address;
	private String role;
	private int phone1;
	private int phone2;
	private String licenseNum;
	private String salesPerson;
	private String roleType;
	
	
public NewUserForm(){
	super();
}
	public NewUserForm(String name
			,String password
			,String shopName
			,String address
			,String role
			,int phone1
			,int phone2
			,String licenseNum
			,String salesPerson
			,String roleType
			,String email)
	{
		
		super();
		this.name=name;
		this.password=password;
		this.shopName=shopName;
		this.address=address;
		this.role=role;
		this.phone1=phone1;
		this.phone2=phone2;
		this.licenseNum=licenseNum;
		this.licenseNum=salesPerson;
		this.roleType=roleType;
		this.email=email;

	}
	
	@Override
	public String toString() {
		return name+
				password+
				shopName+
				address+
				role+
				phone1+
				phone2+
				licenseNum+
				salesPerson+
				roleType+
				email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getPhone1() {
		return phone1;
	}
	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}
	public int getPhone2() {
		return phone2;
	}
	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}
	public String getLicenseNum() {
		return licenseNum;
	}
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}
	public String getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
}

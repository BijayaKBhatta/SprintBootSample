package com.store.form;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class RegistrationForm {

	private String name;
	private String password;
	private Date reg_date;
	private String role;
	private String gender;
	private String email;
	private int age;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RegistrationForm(String name, String password, Date reg_date,
			String role, String gender, int age, String email) {
		super();
		this.name = name;
		this.password = password;
		this.reg_date = reg_date;
		this.role = role;
		this.gender = gender;
		this.age = age;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public RegistrationForm() {
		super();
		// TODO Auto-generated constructor stub
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

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Journeyform [name=" + name + ", password=" + password
				+ ", reg_date=" + reg_date + ", role=" + role + ", gender="
				+ gender + ", age=" + age + "]";
	}

}

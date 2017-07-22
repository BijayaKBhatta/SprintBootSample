package com.store.dto;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {

	private String name;
	private String role;
	private int uid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(String name, String role, int uid) {
		super();
		this.name = name;
		this.role = role;
		this.uid = uid;
	}
	
	
	
}

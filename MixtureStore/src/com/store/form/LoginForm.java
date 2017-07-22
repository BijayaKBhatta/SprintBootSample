package com.store.form;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class LoginForm {

	private String name;
	private String password;
	
	
public LoginForm(){
	super();
}
	public LoginForm(String name
			,String password)
		{
		
		super();
		this.name=name;
		this.password=password;
	
	}
	
	@Override
	public String toString() {
		return name+
				password;
				
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
}

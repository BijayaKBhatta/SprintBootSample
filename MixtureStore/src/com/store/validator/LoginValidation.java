package com.store.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.store.form.LoginForm;
import com.store.form.RegistrationForm;

@Component
public class LoginValidation implements Validator{

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(RegistrationForm.class);
		
	}

	@Override
	public void validate(Object command, Errors errors) {
		LoginForm loginForm = null;
		loginForm = (LoginForm) command;
		if (isValid(loginForm.getName())) {
			errors.rejectValue("name", "name.blank");
		}
		if (isValid(loginForm.getPassword())) {
			errors.rejectValue("password", "password.blank");
		}
		
	
       

	}
		
	private boolean isValid(String value) {
		if (value == null || "".equals(value)) {
			return true;
		}
		return false;
	}
}

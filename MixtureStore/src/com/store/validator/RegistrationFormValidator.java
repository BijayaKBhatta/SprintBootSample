package com.store.validator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.store.form.RegistrationForm;

@Component
public class RegistrationFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(RegistrationForm.class);
		
	}

	@Override
	public void validate(Object command, Errors errors) {
		RegistrationForm registrationForm = null;
		registrationForm = (RegistrationForm) command;
		if (isValid(registrationForm.getName()) || registrationForm.getName() =="") {
			errors.rejectValue("name", "name.blank");
		}
		if (isValid(registrationForm.getPassword())) {
			errors.rejectValue("password", "password.blank");
		}
		if (isValid(registrationForm.getGender())) {
			errors.rejectValue("gender", "gender.blank");
		}
		/*if(registrationForm.getReg_date()!=new Date()){
			errors.rejectValue("reg_date", "reg_date.blank");
		}*/
		if (errors.hasFieldErrors() == false) {
			if (registrationForm.getAge() <= 0) {
				errors.rejectValue("age", "age.blank");
			}
		}
/*		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "source", "required.source","Source is required!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "destination", "required.destination", "Destination is required!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doj","required.doj", "Date of journey is required!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passengerNm", "required.passengerNm", "Passenger Name is required!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "required.gender", "Gender is required!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "required.age", "Age is required!");
*/        

	}
		
	private boolean isValid(String value) {
		if (value == null || "".equals(value)) {
			return true;
		}
		return false;
	}

}

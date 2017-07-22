package com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.store.dto.UserDTO;
import com.store.form.NewUserForm;
import com.store.form.RegistrationForm;
import com.store.validator.NewUserFormValidation;
import com.store.validator.RegistrationFormValidator;

@Controller
@RequestMapping("/newUserRegistration.htm")
public class NewUserRegistration {
	@Autowired
	private NewUserFormValidation validator;
	@RequestMapping(method=RequestMethod.GET)
	public String doInitial(Model model){
		NewUserForm registrationForm=null;
		registrationForm=new NewUserForm();
		model.addAttribute("newUserRegistration", registrationForm);
		System.out.println("Blank scree ");
		
		return "newUserRegistration";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String process(Model model,@ModelAttribute("registrationForm")RegistrationForm registrationForm,BindingResult errors){
		UserDTO userDTO=null;
		if(validator.supports(registrationForm.getClass())){
			validator.validate(registrationForm, errors);
			if(errors.hasErrors()){
				//System.out.println("error");
				return "newUserRegistration";
			}
		}
		userDTO=new UserDTO(registrationForm.getName(),registrationForm.getRole() , 122);
		model.addAttribute("user", userDTO);
		//System.out.println("success");
		
		return "userdetails";
	}
	
}

package com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.store.dto.UserDTO;
import com.store.form.RegistrationForm;
import com.store.validator.RegistrationFormValidator;

@Controller
@RequestMapping("/registrationForm.htm")
public class StoreUserController {
	@Autowired
	private RegistrationFormValidator validator;
	@RequestMapping(method=RequestMethod.GET)
	public String doInitial(Model model){
		RegistrationForm registrationForm=null;
		registrationForm=new RegistrationForm();
		model.addAttribute("registrationForm", registrationForm);
		return "registrationdetails";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String process(Model model,@ModelAttribute("registrationForm")RegistrationForm registrationForm,BindingResult errors){
		UserDTO userDTO=null;
		if(validator.supports(registrationForm.getClass())){
			validator.validate(registrationForm, errors);
			if(errors.hasErrors()){
				return "registrationdetails";
			}
		}
		userDTO=new UserDTO(registrationForm.getName(),registrationForm.getRole() , 122);
		model.addAttribute("user", userDTO);
		return "userdetails";
	}
	
}

package com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.store.dto.UserDTO;
import com.store.form.LoginForm;
import com.store.form.NewUserForm;
import com.store.form.RegistrationForm;
import com.store.validator.LoginValidation;
import com.store.validator.NewUserFormValidation;
import com.store.validator.RegistrationFormValidator;

@Controller
@RequestMapping("/login.htm")
public class LoginController {
	@Autowired
	private LoginValidation validator;
	@RequestMapping(method=RequestMethod.GET)
	public String doInitial(Model model){
	
		LoginForm loginForm=null;
		loginForm=new LoginForm();
		model.addAttribute("login", loginForm);
		System.out.println("cominggg");
		return "login";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String process(Model model,@ModelAttribute("registrationForm")LoginForm registrationForm,BindingResult errors){
		UserDTO userDTO=null;
		if(validator.supports(registrationForm.getClass())){
			validator.validate(registrationForm, errors);
			if(errors.hasErrors()){
				return "login";
			}
		}
		userDTO=new UserDTO(registrationForm.getName(),registrationForm.getPassword() , 122);
		model.addAttribute("user", userDTO);
		return "userdetails";
	}
	
}

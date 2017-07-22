package com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.store.form.RegistrationForm;
import com.store.validator.RegistrationFormValidator;


@Controller
@RequestMapping("/index.htm")
public class IndexController {

	@RequestMapping(method=RequestMethod.GET)
	public String doInitial(Model model){
			return "index";
	}
	
	
	
}

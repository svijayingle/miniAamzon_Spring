package com.demo.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.spring.entity.*;
@Controller
@RequestMapping("user")
public class UsereRegistration {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor =new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	@RequestMapping("registration")
	public String ShowForm(Model theModel) {
		
		User user = new User();
		
		theModel.addAttribute("user", user);
		
		return "registration-form";
	}
	
	@RequestMapping("processform")
	public String ProcessForm(@Valid @ModelAttribute("user") User user, BindingResult theBindingResult) {
		
		
		if(theBindingResult.hasErrors()) {
			return "registration-form";
		}
		System.out.println("Registration Successfull");
		return "registration-confirm";
	}
}

package com.demo.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
	
	@RequestMapping("about-us")
	public String gotoLogin() {
		return "login-form";
	}
}

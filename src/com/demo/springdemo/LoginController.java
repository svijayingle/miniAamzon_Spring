package com.demo.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class LoginController {

	@RequestMapping("login")
	public String gotoLogin() {
		return "login-form";
	}
	
	@RequestMapping("loginprocess")
	public String LoginProcess(HttpServletRequest req, Model model) {
		String Username = req.getParameter("Username");
		String Password = req.getParameter("Password");
		String message = "WelCome "+Username.toUpperCase();
		model.addAttribute("Username", message);
		return "login-process";
	}
}

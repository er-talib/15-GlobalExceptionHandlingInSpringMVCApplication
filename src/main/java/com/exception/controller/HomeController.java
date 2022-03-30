package com.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String handlerMethod(Model model) {
		
		model.addAttribute("homeMessage", "This is home controller meaasge..!!!");
		String s = null ;
		s.length();
		
		return "home";
	}
	
	

}

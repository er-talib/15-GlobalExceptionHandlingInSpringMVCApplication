package com.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class IndexController {
	
	@RequestMapping("/index")
	public String handlerMethod(Model model) {
		
		model.addAttribute("indexMessage", "This is index controller meaasge..!!!");
		int i = 13/0 ;
		System.out.println(i);
		
		return "index";
	}

}

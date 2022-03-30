package com.exception.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@Controller
@ControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String errorHandler(Model model) {
		model.addAttribute("errorPage", "Somthing went wrong please try again some time..!!!");
		return "errorpage";
	}

	@ExceptionHandler(value = ArithmeticException.class)
	public String errorHandler2(Model model) {
		model.addAttribute("errorPage", "Somthing went wrong please try again some time..!!!");
		return "errorpage";
	}
	
	

//	@ExceptionHandler(value = Exception.class)  // multiple exception handler 
//	public String errorHandlerM(Model model) {
//		model.addAttribute("errorPage", "Somthing went wrong please try again some time..!!!");
//		return "errorpage";
//	}

}


package com.magicpin.profile.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MPINExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String handleExp(Exception e , Model model) {
		model.addAttribute("errorMesgage", "Unable to Process "+e.getMessage());
		return "error";
	}
	@ExceptionHandler(UserAlreadyExistsException.class)
	public String handleExp(UserAlreadyExistsException e ,Model model) {
		
		model.addAttribute("errorMesg" , "Profile Allready Exist  " + e.getMessage());
		return "error";
	}
	
}

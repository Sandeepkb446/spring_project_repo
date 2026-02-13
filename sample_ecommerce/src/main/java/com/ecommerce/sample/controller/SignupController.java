package com.ecommerce.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {
	
	@RequestMapping("signup")
	public ModelAndView doSignup() {
		System.out.println("SignupController.doSignup()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		return mv;
	}

}

package com.rapido.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupConroller {
	
	@RequestMapping("register")
	public ModelAndView viewSignupPage() {
	System.out.println("SignupConroller.viewSignupPage()");
	ModelAndView mv = new ModelAndView();
	mv.setViewName("register");
	return mv;
	}
	
	@PostMapping("signup")
	public ModelAndView doSignIn(@RequestParam("email") String email ,@RequestParam("name") String name , @RequestParam("mobile") String mobile ) {
		System.out.println("SignupConroller.doSignIn()");
		System.out.println("User details fetched " + email + name + mobile);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("confirmation");
		return mv;
	}
}

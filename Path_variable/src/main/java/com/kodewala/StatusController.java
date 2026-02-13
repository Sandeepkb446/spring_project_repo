package com.kodewala;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {

	
	@RequestMapping("/knowStatus/{id}")
	public String status(@PathVariable("id") int id , Model model) {
		System.out.println("StatusController.status()  ... and ID is :   " + id);
		model.addAttribute("id" , id);
		return "statusPage";
	}
}

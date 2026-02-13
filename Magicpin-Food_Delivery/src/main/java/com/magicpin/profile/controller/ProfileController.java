package com.magicpin.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.magicpin.profile.entity.ProfileEntity;
import com.magicpin.profile.request.ProfileRequest;
import com.magicpin.profile.service.ProfileService;


@Controller
public class ProfileController {

	@Autowired
	ProfileService profileService;
	
	
	@GetMapping("createAcc")
	public String viewProfilePage() {
		System.out.println("ProfileController.viewProfilePage()");
		return "profile";
	}
	
	@PostMapping("register")
	public String doRegister(@ModelAttribute ProfileRequest profileRequest) {
		
		System.out.println("ProfileController.doRegister()");
		String msg = profileService.registerUser(profileRequest); 
		System.out.println(msg);
		return "confirmation-page";
	}
	
	@GetMapping("viewAllProfiles")
	public String showProfiles(Model model) {
		System.out.println("ProfileController.showProfiles()");
	 List<ProfileEntity> allprofiles = profileService.viewAllProfiles();
		model.addAttribute("profiles" , allprofiles);
		return "viewAllProfiles";
	}
	
	@GetMapping("deleteProfile/{id}")
	public String deleteProfileById(@PathVariable("id") int id) {
		System.out.println("ProfileController.deleteProfileById()");
		profileService.deleteProfileById(id);
		return "redirect:/viewAllProfiles";
	}
	@GetMapping("editProfile/{id}")
	public String editProfilebyId(@PathVariable("id") int id , Model model) {
		ProfileEntity entity = profileService.getProfileById(id);
		model.addAttribute("entity" , entity);
		return "editProfile";
		
	}
	@PostMapping("updateProfile")
	public String update(ProfileEntity entity) {
		profileService.updateProfile(entity);
		return "redirect:/viewAllProfiles";
	}
}



package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.UserEntity;
import com.sample.request.UserRequest;
import com.sample.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserRequest request) {
		String msg = service.createUser(request);
		return "User Created "+ msg;
		
	}
	@GetMapping("/getallusers")
	public Page<UserEntity> showAllUsers(){
		return service.getUsers(1, 5);
	}
}

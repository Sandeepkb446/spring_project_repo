package com.flipkart.controller;
import com.flipkart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.request.UserRequest;

@RestController
public class UserController {

   

	@Autowired
	private UserService service;

	
    @PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserRequest request) {
		System.out.println("UserController.registerUser()");
		String msg = service.registerUser(request);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}
    @GetMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserRequest request){
    	String res = service.loginUser(request);
    	return new ResponseEntity<String>(res,HttpStatus.OK);
    	
    }
}

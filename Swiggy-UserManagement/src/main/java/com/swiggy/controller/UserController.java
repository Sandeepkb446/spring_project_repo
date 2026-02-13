
package com.swiggy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.entity.UserEntity;
import com.swiggy.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@PostMapping("/register")
	public ResponseEntity <String> register(@RequestBody UserEntity entity){
		String msg = userService.registerUser(entity);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/findAllUsers")
	public ResponseEntity<List<UserEntity>>showUsers(){
		List<UserEntity> result =userService.viewUsers();
		return new ResponseEntity<List<UserEntity>> (result,HttpStatus.OK);
	}
	@PutMapping("/edit/{id}")
	public ResponseEntity<String> updateUser(@PathVariable("id") Integer id ,@RequestBody UserEntity entity){
		String msg = userService.editUser(id, entity);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@PatchMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
		System.out.println("UserController.deleteUser()");
		String msg = userService.deleteUser(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
}

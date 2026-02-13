package com.kodewala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.kodewala.user.User;

@Component
public class UserService {
	
	@Autowired
	private User user;
	
	
	public void printUser() {
		
	System.out.println(user.getName());
	System.out.println(user.getAge());
	
	}
}

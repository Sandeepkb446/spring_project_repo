package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.advice.UserAlreadyExistException;
import com.flipkart.entity.UserEntity;
import com.flipkart.repository.UserRepository;
import com.flipkart.request.UserRequest;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public String registerUser(UserRequest request) {
		
		//validate user by email
	      // Check if user already exists
        UserEntity existingUser = userRepository.findUserByEmail(request.getEmail());
        if (existingUser != null) {
            throw new UserAlreadyExistException("User already exists");
        }

        // Generate password
        String password = java.util.UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 9)
                + "!@#$%^&*".charAt(new java.security.SecureRandom().nextInt(8));

        // Create new user
        UserEntity entity = new UserEntity();
        entity.setName(request.getName());
        entity.setEmail(request.getEmail());
        entity.setPassword(password);

        userRepository.createUser(entity);

        // Return generated password
        return "User Profile Created Succesfully , Your UserId : "+ entity.getEmail() + " , &  Password is : " +  password;
	
	}
	
	public String loginUser(UserRequest request) {

	    UserEntity existingUser = userRepository.findUserByEmail(request.getEmail());

	    if (existingUser == null) {
	        throw new IllegalArgumentException("User not found");
	    }

	    if (request.getEmail().equals(existingUser.getEmail())
	            && request.getPassword().equals(existingUser.getPassword())) {

	        return "Login Successfully";
	    }

	    throw new IllegalArgumentException("Invalid Credentials");
	}

	
}

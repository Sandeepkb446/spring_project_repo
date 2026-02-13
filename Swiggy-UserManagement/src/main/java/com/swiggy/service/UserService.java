package com.swiggy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.advice.UserAlreadyExist;
import com.swiggy.entity.UserEntity;
import com.swiggy.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String registerUser(UserEntity entity) {
		
	
		Integer res = null;
		UserEntity userEntity = userRepository.getUserByEmail(entity.getEmail());
		if (userEntity==null) {
			res = userRepository.saveUser(entity);
			return "User created suceefully" + res;
		}else {
			throw new UserAlreadyExist("User ALready Exist");
		}
		
 
	}
	
	public List<UserEntity> viewUsers(){
		List<UserEntity> users = userRepository.showAllUsers();
		return users;
	}
	
	public String editUser(Integer id, UserEntity entity) {
	   UserEntity user=  userRepository.getUserById(id);
	   	System.out.println(entity);
	   if (user!=null) {
		entity.setUid(id);
		userRepository.updateUser(entity);
		return "profile updated Succcessylly";
	} else {
			throw new IllegalArgumentException("user not found");
	}
	   
	}
	
	public String deleteUser(Integer id) {
		
	 UserEntity	userEntity = userRepository.getUserById(id);
		if(userEntity != null) {
			UserEntity entity= new UserEntity();
			entity.setUid(id);
			entity.setStatus(false);
			userRepository.updateUser(entity);
			return "User deleted Succesfully";
		}else {
			throw  new IllegalArgumentException("User Not found");
		}
	}
	
	
}

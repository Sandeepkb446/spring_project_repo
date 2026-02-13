package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sample.entity.UserEntity;
import com.sample.repository.UserRepository;
import com.sample.request.UserRequest;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public String  createUser(UserRequest request) {
		
		UserEntity entity = new UserEntity();
		entity.setName(request.getName());
		entity.setAddress(request.getAddress());
		entity.setPhone(request.getPhone());

		entity = repository.save(entity);
		return  "User is created : "+ entity.getUid(); 
		 
	}
	public Page<UserEntity> getUsers(Integer pageName,Integer pageSize){
		Pageable pageable = PageRequest.of(pageName, pageSize);
		
		         Page<UserEntity> page =repository.findAll(pageable);
		         
		         return page;
	}
}

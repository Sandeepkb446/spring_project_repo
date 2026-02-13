package com.swiggy.advice;

public class UserAlreadyExist extends RuntimeException {
	
	public UserAlreadyExist(String _msg) {
		super(_msg);
	}
}

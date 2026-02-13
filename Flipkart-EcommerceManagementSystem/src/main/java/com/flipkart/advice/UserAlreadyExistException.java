package com.flipkart.advice;

public class UserAlreadyExistException  extends RuntimeException{

	public UserAlreadyExistException(String msg) {
		super(msg);
	}
}

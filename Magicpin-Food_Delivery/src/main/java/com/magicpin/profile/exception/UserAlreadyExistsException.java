package com.magicpin.profile.exception;

public class UserAlreadyExistsException  extends RuntimeException{

	public UserAlreadyExistsException(String _msg) {
		super(_msg);
	}
}

package com.swiggy.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserControllerException {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e) {
		System.out.println("UserControllerException.handleException()");
		return new ResponseEntity<String>("Something Went Wrong"+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(UserAlreadyExist.class)
	public ResponseEntity<String> handleException(UserAlreadyExist e) {
		System.out.println("UserControllerException.handleException()");
		return new ResponseEntity<String>("Something Went Wrong"+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleException(IllegalArgumentException e) {
		System.out.println("UserControllerException.handleException()");
		return new ResponseEntity<String>("Something Went Wrong"+e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}

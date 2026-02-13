package com.uber.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class UberAdvice {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String>handleException(Exception e)
	{
    	return new ResponseEntity<String>("Error"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
    @ExceptionHandler(IllegalArgumentException.class)
   	public ResponseEntity<String>handleException(IllegalArgumentException e)
   	{
       	return new ResponseEntity<String>("Error:"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
   	}

}

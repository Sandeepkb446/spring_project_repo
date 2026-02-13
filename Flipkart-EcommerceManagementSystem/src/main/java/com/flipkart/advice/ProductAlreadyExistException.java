package com.flipkart.advice;

public class ProductAlreadyExistException  extends RuntimeException{

	public ProductAlreadyExistException(String msg) {
		super(msg);
	}
}

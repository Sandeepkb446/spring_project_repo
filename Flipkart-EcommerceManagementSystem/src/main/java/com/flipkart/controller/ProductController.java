package com.flipkart.controller;

import java.net.http.HttpClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.flipkart.request.ProductRequest;
import com.flipkart.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/createProduct")
	public ResponseEntity<String> createProduct(@RequestBody ProductRequest request){
		String msg = service.insertProduct(request);
		return  new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/findProduct/{name}")
	public ResponseEntity<ProductRequest> showProductByName(@PathVariable("name") String pname){
		ProductRequest request = service.getProductDetByName(pname);
		return new ResponseEntity<ProductRequest>(request,HttpStatus.OK);
		
	}
	
	
	
}

package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.advice.ProductAlreadyExistException;
import com.flipkart.entity.ProductEntity;
import com.flipkart.repository.ProductRepository;
import com.flipkart.request.ProductRequest;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public String insertProduct(ProductRequest request) {
	ProductEntity product = repository.getProductByName(request.getPname());
	
	if (product!=null) {
		throw new IllegalArgumentException("Product is Alredy Exist");
	}
	ProductEntity newProduct = new ProductEntity();
	
	newProduct.setPname(request.getPname());
	newProduct.setPrice(request.getPrice());
	newProduct.setCategory(request.getCategory());
	newProduct.setDescription(request.getDescription());

	Integer id =  repository.saveProduct(newProduct);
	
	return request.getPname() + " Product Inserted Succesfully , Id is : " +id;  
	}
	
	public ProductRequest getProductDetByName(String name) {
		
		
		ProductEntity product = repository.getProductByName(name);
		
		if (product==null) {
			throw new ProductAlreadyExistException("Product is Not Found");
		}
		ProductRequest req = new ProductRequest();
		req.setPid(product.getPid());
		req.setPname(product.getPname());
		req.setPrice(product.getPrice());
		req.setCategory(product.getCategory());
		req.setDescription(product.getDescription());
		
		return req;
	}
	
}

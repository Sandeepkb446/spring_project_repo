package com.flipkart.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.ProductEntity;


@Repository
public class ProductRepository {

	@Autowired
	private SessionFactory factory;
	public Integer saveProduct(ProductEntity product) {
		
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		Integer idval =  (Integer) session.save(product);
		tnx.commit();
		return idval;
	}
	public ProductEntity getProductByName(String name) {
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
	 	ProductEntity product  =session.createQuery("from ProductEntity where pname=:pname",ProductEntity.class).setParameter("pname",name).uniqueResult();
		tnx.commit();
	 	return product;
		
	}
}

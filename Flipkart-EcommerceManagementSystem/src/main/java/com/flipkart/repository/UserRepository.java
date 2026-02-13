package com.flipkart.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.UserEntity;

@Repository
public class UserRepository {

	@Autowired	
	private SessionFactory factory;
	
	public Integer createUser(UserEntity entity) {
		
		Session sesson = factory.openSession();
		Transaction tnx = sesson.beginTransaction();
		Integer idVal = (Integer) sesson.save(entity);
		tnx.commit();
		return idVal;
		
	}
	public UserEntity findUserByEmail(String _email) {
		Session sesson = factory.openSession();
		Transaction tnx = sesson.beginTransaction();
		UserEntity entity = sesson.createQuery("from UserEntity where email=:email", UserEntity.class).setParameter("email",_email).uniqueResult();
		tnx.commit();
		return entity;
	}
}

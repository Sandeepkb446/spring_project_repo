package com.swiggy.repository;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.swiggy.entity.UserEntity;

@Repository
public class UserRepository {
	
	@Autowired
	 private SessionFactory factory;
	
	public Integer saveUser(UserEntity entity) {
		
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		
		Integer response= (Integer) session.save(entity);
		tnx.commit();
		return response;
	}
	
	public List<UserEntity> showAllUsers(){
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		List<UserEntity> res  =	session.createQuery("from UserEntity where status=true",UserEntity.class ).list();
		tnx.commit();
		return res; 
		
	}
	
	public UserEntity getUserByEmail(String _email) {
		Session session = factory.openSession();
		UserEntity res=	session.createQuery("from UserEntity where email=:email",UserEntity.class).setParameter("email",_email).uniqueResult();
		return res;
	}
	public UserEntity getUserById(Integer id) {
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		UserEntity user =  session.get(UserEntity.class,id);
		tnx.commit();
		return user;
		
	}
	
	public void updateUser(UserEntity entity) {
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		System.out.println(entity);
		session.update(entity);
		tnx.commit();
	}
}

package com.magicpin.profile.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.magicpin.profile.entity.ProfileEntity;


@Repository
public class ProfileRepository {
	
	@Autowired
	private SessionFactory factory;
	
	public String saveProfile(ProfileEntity entity) {
		
		System.out.println("ProfileRepository.saveProfile()");
		Session session =  factory.openSession();
		Transaction tnx = session.beginTransaction();
		Integer id = (Integer) session.save(entity);
		tnx.commit();
		return "User id creted : " + id; 
			
	}
	
	public ProfileEntity getProfileByEmail(String _email) {
		Session session =  factory.openSession();
		Transaction tnx = session.beginTransaction();
		ProfileEntity result = session.createQuery("from ProfileEntity where email=:email" ,ProfileEntity.class).setParameter("email",_email).uniqueResult();
		tnx.commit();
		return result;
	}
	
	public List<ProfileEntity> getAllProfiles(){
		System.out.println("ProfileRepository.getAllProfiles()");
		Session session =  factory.openSession();
		Transaction tnx = session.beginTransaction();
		List<ProfileEntity> profiles = session.createQuery("from ProfileEntity" , ProfileEntity.class).list();
		tnx.commit();
		return profiles;
	
	}
	
	public String deleteById(int id) {
		System.out.println("ProfileRepository.deleteById()");
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		ProfileEntity entity =session.get(ProfileEntity.class, id);
		if (entity != null) {
			session.delete(entity);
		}
		tnx.commit();
		return "User id Deleted : " + id; 
	}
	
	public ProfileEntity findProfileById(int id) {
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		ProfileEntity entity = session.get(ProfileEntity.class, id);
		return entity;
	}
	
	public void updateProfileById(ProfileEntity entity) {
		Session session = factory.openSession();
		Transaction tnx = session.beginTransaction();
		session.update(entity);
		tnx.commit();
		
		
	}

}

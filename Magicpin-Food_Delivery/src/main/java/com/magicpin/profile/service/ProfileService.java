package com.magicpin.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magicpin.profile.controller.ProfileController;
import com.magicpin.profile.entity.ProfileEntity;
import com.magicpin.profile.exception.UserAlreadyExistsException;
import com.magicpin.profile.repository.ProfileRepository;
import com.magicpin.profile.request.ProfileRequest;

@Service
public class ProfileService {

    private final ProfileController profileController;
	
	@Autowired
	private ProfileRepository profileRepository;

    ProfileService(ProfileController profileController) {
        this.profileController = profileController;
    }
	
	public String registerUser(ProfileRequest request) {
		
		ProfileEntity entity = new ProfileEntity();
		entity.setName(request.getName());
		entity.setEmail(request.getEmail());
		entity.setMobile(request.getMobile());
		
		ProfileEntity profilrByEmail =  profileRepository.getProfileByEmail(request.getEmail());
		String res= null;
		
		if(profilrByEmail ==null) {
			res = profileRepository.saveProfile(entity);
		}
		else {
			throw  new UserAlreadyExistsException("User allready Exist Error code Ec1");
		}
		
		
		return "User registerd Succesfully" + res; 
		
	}
	
	public List<ProfileEntity> viewAllProfiles(){
	List<ProfileEntity> profiles =  profileRepository.getAllProfiles();
	return profiles;
	}
	
	public void deleteProfileById(int id) {
		profileRepository.deleteById(id);
	}
	
	public ProfileEntity getProfileById(int id) {
		return profileRepository.findProfileById(id);
	}
	public void updateProfile(ProfileEntity entity) {
		profileRepository.updateProfileById(entity);
	}
}

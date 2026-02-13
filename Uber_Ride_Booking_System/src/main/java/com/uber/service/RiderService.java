package com.uber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.entity.RiderEntity;
import com.uber.repository.IRiderRepository;
import com.uber.request.RiderRequest;

@Service
public class RiderService {
	
	@Autowired
    private IRiderRepository iRiderRepository;	
	
	public String createRider(RiderRequest request) {
		
		if (iRiderRepository.existsByEmail(request.getEmail())) {
	        return "Rider already exists with this email";
	    }
		System.out.println("RiderService.createRider()");
		RiderEntity entity = new RiderEntity();
		entity.setName(request.getName());
		entity.setEmail(request.getEmail());
		entity.setPhone(request.getPhone());
		entity.setCurrentLocation(request.getCurrentLocation());
		
		entity = iRiderRepository.save(entity);
		
		  if (entity.getId() != 0) {
	            return "Rider created successfully. Rider ID: " + entity.getId();
	        }

	        return "Unable to process";
		
	}
	public RiderEntity findRiderByid(Integer id) {
		return iRiderRepository.findById(id).orElse(null);
		
	}
	
	public String updateRider(Integer id, RiderRequest request) {

	    RiderEntity rider = iRiderRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Rider not found"));

	    rider.setName(request.getName());
	    rider.setEmail(request.getEmail());
	    rider.setPhone(request.getPhone());
	    rider.setCurrentLocation(request.getCurrentLocation());

	     iRiderRepository.save(rider);
	     return "Rider updated Succesfully";
	}
	public String deleteRider(Integer id) {

	    if (!iRiderRepository.existsById(id)) {
	        return "Rider not found";
	    }

	    iRiderRepository.deleteById(id);

	    return "Deleted successfully";
	}


}

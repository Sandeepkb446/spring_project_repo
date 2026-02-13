package com.uber.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.entity.DriverEntity;
import com.uber.repository.IDriverRepository;
import com.uber.request.DriverRequest;

@Service
public class DriverService {
	
	@Autowired
    private IDriverRepository idriverRepository;
	
	public String createDriver(DriverRequest request) {
		
		
		
		DriverEntity entity = new DriverEntity();
		entity.setName(request.getName());
		entity.setVehicleNumber(request.getVehicleNumber());
		entity.setAvailability(request.getAvailability());
		entity.setPhone(request.getPhone());
		entity.setCurrentLocation(request.getCurrentLocation());
		
		entity = idriverRepository.save(entity);
		
		  if (entity.getId() != 0) {
	            return "Driver created successfully. Driver ID: " + entity.getId();
	        }

	        return "Unable to process";
		
	}
	public DriverEntity findDriverByid(Integer id) {
		return idriverRepository.findById(id).orElse(null);
		
	}
//	
	public String updateDriver(Integer id, DriverRequest request) {

	    DriverEntity driver = idriverRepository.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Driver not found"));

	    driver.setName(request.getName());
	    driver.setPhone(request.getName());
	    driver.setAvailability(request.getAvailability());
	    driver.setVehicleNumber(request.getVehicleNumber());
	    driver.setCurrentLocation(request.getCurrentLocation());
	   
	     idriverRepository.save(driver);
	     return "Driver updated Succesfully";
	}
	public String deleteDriver(Integer id) {

	    if (! idriverRepository.existsById(id)) {
	        return "Driver not found";
	    }

	    idriverRepository.deleteById(id);

	    return "Deleted successfully";
	}
//

}

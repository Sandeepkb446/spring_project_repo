package com.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.entity.RideManagementEntity;
import com.uber.entity.enums.RideStatus;
import com.uber.repository.IRideMgmRepository;
import com.uber.request.RideMgmRequest;

@Service
public class RideMgmService {
	
	@Autowired
	private IRideMgmRepository repository;
	
	public String bookNewRide(RideMgmRequest request) {
		
		RideManagementEntity entity = new RideManagementEntity();
		
		entity.setRiderId(request.getRiderId());
		entity.setDriverId(request.getDriverId());
		entity.setSource(request.getSource());
		entity.setDestination(request.getDestination());
		entity.setFare(request.getFare());
		entity.setStatus(RideStatus.REQUESTED);
		
		entity = repository.save(entity);
		
		return "Booking Confirmed with fare:"+entity.getFare()+" and status:"+entity.getStatus();
	}
	public RideManagementEntity findRideDetailsByid(Integer id) {
		return repository.findById(id).orElse(null);
		
	}
	public String updateRideStatus(Integer id,RideMgmRequest request) {
		RideManagementEntity ride = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Ride Details not found"));
		ride.setStatus(request.getStatus());
		ride= repository.save(ride);
		return " Ride status changed to this :"+ request.getStatus(); 
	}
	public String cancelRide(Integer id) {
		RideManagementEntity ride =repository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
        
        ride.setStatus(RideStatus.CANCELLED);
        ride= repository.save(ride);
  
      return"!!Opps"+ ride.getId()+" Booking  is Cancelled Please try Again" ;
	}
	
	public List<RideManagementEntity> getRidesByRiderId(Integer riderId) {
	    return repository.findByRiderId(riderId);
	}
	
}



package com.uber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uber.entity.RideManagementEntity;
import com.uber.request.RideMgmRequest;
import com.uber.service.RideMgmService;

@RestController
public class RideMgmController {
	
	@Autowired
	private RideMgmService service;
	
	@PostMapping("/book")
	public ResponseEntity<String> bookRide(@RequestBody RideMgmRequest request){
		String msg = service.bookNewRide(request);
		   return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	@GetMapping("/findridedetails/{id}")
	public ResponseEntity<?> getRideDetails(@PathVariable Integer id){
		RideManagementEntity details = service.findRideDetailsByid(id);
		if (details == null) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                             .body("Ride not found");
	    }

	    return ResponseEntity.ok(details);
	}
	
	@PutMapping("/updaterideststus/{id}")
	public ResponseEntity<String> updateRideStatus(@PathVariable Integer id , @RequestBody RideMgmRequest request){
		String updated = service.updateRideStatus(id, request);
		return ResponseEntity.ok(updated);
		
	}
	@GetMapping("/cancel/{id}")
	public ResponseEntity<String>cancelRide(@PathVariable Integer id)
	{
		String msg=service.cancelRide(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/rider/{riderId}")
	public ResponseEntity<List<RideManagementEntity>> getRidesByRider(
	        @PathVariable Integer riderId) {

	    return ResponseEntity.ok(service.getRidesByRiderId(riderId));
	}
}

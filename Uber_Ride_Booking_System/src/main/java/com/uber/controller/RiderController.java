package com.uber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uber.entity.RiderEntity;
import com.uber.request.RiderRequest;
import com.uber.service.RiderService;

@RestController
public class RiderController {
	@Autowired
	private RiderService service;
	
	@PostMapping("createrider")
	public ResponseEntity<String> createRiderProfie(@RequestBody RiderRequest request){
		System.out.println("RiderController.createRiderProfie()");
		String msg = service.createRider(request);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/findrider/{id}")
	public ResponseEntity<?> getRider(@PathVariable Integer id){
		RiderEntity rider = service.findRiderByid(id);
		if (rider == null) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                             .body("Rider not found");
	    }

	    return ResponseEntity.ok(rider);
	}
	@PutMapping("/updaterider/{id}")
	public ResponseEntity<String> updateRider(@PathVariable Integer id , @RequestBody RiderRequest request){
		String updated = service.updateRider(id, request);
		return ResponseEntity.ok(updated);
		
	}
	@DeleteMapping("/deleterider/{id}")
	public ResponseEntity<String> deleteRider(@PathVariable Integer id) {

	    String response = service.deleteRider(id);

	    return ResponseEntity.ok(response);
	}

}

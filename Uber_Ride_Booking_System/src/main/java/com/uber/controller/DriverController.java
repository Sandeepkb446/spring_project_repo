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

import com.uber.entity.DriverEntity;
import com.uber.entity.RiderEntity;
import com.uber.request.DriverRequest;
import com.uber.request.RiderRequest;
import com.uber.service.DriverService;
import com.uber.service.RiderService;

@RestController
public class DriverController {
	@Autowired
	private DriverService service;
	
	@PostMapping("createdriver")
	public ResponseEntity<String> createDriverProfie(@RequestBody DriverRequest request){
		String msg = service.createDriver(request);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/finddriver/{id}")
	public ResponseEntity<?> getDriver(@PathVariable Integer id){
		DriverEntity rider = service.findDriverByid(id);
		if (rider == null) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                             .body("Rider not found");
	    }

	    return ResponseEntity.ok(rider);
	}
	@PutMapping("/updatedriver/{id}")
	public ResponseEntity<String> updateDriver(@PathVariable Integer id , @RequestBody DriverRequest driver){
		String updated = service.updateDriver(id, driver);
		return ResponseEntity.ok(updated);
		
	}
	@DeleteMapping("/deletedriver/{id}")
	public ResponseEntity<String> deleteDriver(@PathVariable Integer id) {

	    String response = service.deleteDriver(id);

	    return ResponseEntity.ok(response);
	}

}

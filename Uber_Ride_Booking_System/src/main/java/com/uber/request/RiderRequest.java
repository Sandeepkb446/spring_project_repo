package com.uber.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RiderRequest {

	
	private String name;
	private String phone;
	private String email;
	private String currentLocation;
	

}

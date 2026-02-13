package com.uber.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DriverRequest {

	private String name;
    private String phone;
    private String vehicleNumber;
    private Boolean availability;
    private String currentLocation;

}

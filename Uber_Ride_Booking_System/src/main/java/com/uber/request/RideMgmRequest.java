package com.uber.request;

import com.uber.entity.enums.RideStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RideMgmRequest {
	private Integer id;
	private Integer riderId;
	private Integer driverId;
	private String source;
	private String destination;
	private Double fare;
	private RideStatus status;
}

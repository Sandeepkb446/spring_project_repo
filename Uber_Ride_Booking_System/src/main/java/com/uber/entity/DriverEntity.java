package com.uber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="driver_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class DriverEntity {
	@Id
	@SequenceGenerator(name = "gen2",allocationSize = 1,initialValue = 1000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen2")
	private int id;
	@Column
	private String name;
	@Column
    private String phone;
	@Column
    private String vehicleNumber;
	@Column
    private Boolean availability;
	@Column
    private String currentLocation;
	
}

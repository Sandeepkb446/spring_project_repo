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
@Table(name="rider_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class RiderEntity {
	@Id
	@SequenceGenerator(name = "gen1",allocationSize = 1,initialValue = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
	private int id;
	@Column
	private String name;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String currentLocation;
	
}

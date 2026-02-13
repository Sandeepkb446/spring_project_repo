package com.amazon.order.entity;

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
@Table(name="orders_info")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderEntity {
	@Id
	@SequenceGenerator(name = "gen1",allocationSize = 1,initialValue = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
	
	private int oid;
	@Column
	private String itemName;
	@Column
	private int qty;
	@Column
	private int price;
	@Column
	private String description;

}

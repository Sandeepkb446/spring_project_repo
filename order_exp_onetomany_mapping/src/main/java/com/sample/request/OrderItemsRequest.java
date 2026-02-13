package com.sample.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemsRequest {

	private String itemName;
	private int qty;
	private int price; 
}

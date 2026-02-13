package com.amazon.order.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
	
	private String itemName;
	private int qty;
	private int price;
	private String description;

}

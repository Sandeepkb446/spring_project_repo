package com.sample.request;

import java.util.List;

import com.sample.entity.OrderItems;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdersRequest {

	private String status;
	
	private List<OrderItemsRequest> items;
}

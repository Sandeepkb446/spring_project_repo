package com.amazon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amazon.order.entity.OrderEntity;
import com.amazon.order.reposistory.IOrderReposistory;
import com.amazon.order.request.OrderRequest;

@Service
public class OrderService {

	@Autowired
    private  IOrderReposistory orderReposistory;

	public String createOrder(OrderRequest orderRequest) {
		
		OrderEntity entity = new OrderEntity();
		entity.setItemName(orderRequest.getItemName());
		entity.setPrice(orderRequest.getPrice());
		entity.setQty(orderRequest.getQty());
		entity.setDescription(orderRequest.getDescription());
		
		entity=orderReposistory.save(entity);
		
		int orderId =entity.getOid();
		if (orderId > 0){
			return "Your order is placed , Order id is : " + orderId;
		}
		return "Unable to Place Order";
		
	}
}

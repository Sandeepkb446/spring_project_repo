package com.amazon.order.reposistory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazon.order.entity.OrderEntity;

@Repository
public interface IOrderReposistory extends CrudRepository<OrderEntity, Integer> {

}

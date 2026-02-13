package com.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.Orders;

public interface IOrderRepository extends JpaRepository<Orders, Integer> {
	//@Query("SELECT o FROM Orders o JOIN FETCH o.items")
	@EntityGraph(attributePaths = "items")
    List<Orders> findAll();

	
}

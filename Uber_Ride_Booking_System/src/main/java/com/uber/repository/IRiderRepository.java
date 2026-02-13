package com.uber.repository;

import org.springframework.data.repository.CrudRepository;

import com.uber.entity.RiderEntity;

public interface IRiderRepository extends CrudRepository<RiderEntity, Integer> {

	 boolean existsByEmail(String email);
	 RiderEntity findByEmail(String email);
}

package com.uber.repository;


import org.springframework.data.repository.CrudRepository;

import com.uber.entity.DriverEntity;

public interface IDriverRepository extends CrudRepository<DriverEntity, Integer> {

	
}

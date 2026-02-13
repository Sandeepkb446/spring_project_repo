package com.uber.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.uber.entity.DriverEntity;
import com.uber.entity.RideManagementEntity;

public interface IRideMgmRepository extends CrudRepository<RideManagementEntity, Integer> {

	List<RideManagementEntity> findByRiderId(Integer riderId);
}

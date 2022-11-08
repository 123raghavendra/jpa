package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;


public interface HumanService {

	boolean validationAndSave(HumanEntity entity); 
	

	Optional<HumanEntity> findById(int id);
}

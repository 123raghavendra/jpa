package com.xworkz.jpa.repository;



import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;

public interface HumanRepo {

	boolean save(HumanEntity entity);
	
 Optional<HumanEntity> findById(int id);
	
	
}

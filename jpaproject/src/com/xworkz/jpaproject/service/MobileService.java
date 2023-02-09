package com.xworkz.jpaproject.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.jpaproject.entity.MobileEntity;

public interface MobileService {

	boolean validAndSave(MobileEntity entity);
	
	Optional<MobileEntity>findById(int id);
	
	 void updateBrandById(int id,String brand) ;

	
}

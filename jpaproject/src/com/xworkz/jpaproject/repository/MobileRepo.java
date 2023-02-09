package com.xworkz.jpaproject.repository;

import java.util.Optional;

import com.xworkz.jpaproject.entity.MobileEntity;

public interface MobileRepo {

	boolean save(MobileEntity entity);

	Optional<MobileEntity> findById(int id);// query is not required

	void updateBrandById(int id, String brand);

	//MobileEntity findByBrand(String brand);
//
//	int findPriceByBrand(String brand);
//
//	void updatePriceByBrand(int price, String brand);
}

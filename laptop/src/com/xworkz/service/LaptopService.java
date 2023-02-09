package com.xworkz.service;

import java.util.List;

import com.xworkz.entity.LaptopEntity;

public interface LaptopService {

	public boolean save(LaptopEntity entity);

	public List<LaptopEntity> readAll(LaptopEntity entity);

	LaptopEntity findByBrand(String brand);

	LaptopEntity findByColour(String colour);

	LaptopEntity findByHardDisk(int hardDisk);

	LaptopEntity findById(int id);

	LaptopEntity findByBrandAndColour(String brand, String colour);

	LaptopEntity findByRamSizeAndId(int ramSize, int id);

	public String findBrandByColour(String colour);

	Object[] findColourAndRamSizeByBrand(String brand);

	void updateBrandByColour(String brand, String colour);

	public void updateRamSizeByHardDisk(int ramSize, int hardDisk);

	void deleteById(int id);
	
	void deleteByBrand(String brand);


}

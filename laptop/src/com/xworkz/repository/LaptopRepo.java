package com.xworkz.repository;

import java.util.List;

import com.xworkz.entity.LaptopEntity;

public interface LaptopRepo {

	public boolean save(LaptopEntity entity);

	public List<LaptopEntity> readAll();

	LaptopEntity findByBrand(String brand);

	LaptopEntity findByColour(String colour);

	LaptopEntity findByHardDisk(int hardDisk);

	LaptopEntity findById(int id);

	LaptopEntity findByBrandAndColour(String brand, String colour);

	LaptopEntity findByRamSizeAndId(int ramSize, int id);

	String findBrandByColour(String colour);

	Object[] findColourAndRamSizeByBrand(String brand);

	void updateBrandByColour(String brand, String colour);

	void updateRamSizeByHardDisk(int ramSize, int hardDisk);

	void deleteById(int id);

	void deleteByBrand(String brand);

}

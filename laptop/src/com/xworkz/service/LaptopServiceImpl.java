package com.xworkz.service;

import java.util.List;

import com.xworkz.entity.LaptopEntity;
import com.xworkz.repository.LaptopRepo;
import com.xworkz.repository.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService {

	LaptopRepo repo = new LaptopRepoImpl();

	@Override
	public boolean save(LaptopEntity entity) {
		System.out.println("validating  save method ");
		boolean save = repo.save(entity);
		System.out.println(save);

		return true;
	}

	@Override
	public List<LaptopEntity> readAll(LaptopEntity entity) {
		System.out.println("Validating readAll method..");
		return repo.readAll();
	}

	@Override
	public LaptopEntity findByBrand(String brand) {
		System.out.println("validatig the   findByBrand......!");
		LaptopEntity findByBrand = repo.findByBrand(brand);
		System.out.println(findByBrand);

		return null;
	}

	@Override
	public LaptopEntity findByColour(String colour) {
		System.out.println("validatig the   findByColour......!");
		return repo.findByColour(colour);

	}

	@Override
	public LaptopEntity findByHardDisk(int hardDisk) {
		System.out.println("validatig the   findByHardDisk......!");
		return this.repo.findByHardDisk(hardDisk);
	}

	@Override
	public LaptopEntity findById(int id) {
		System.out.println("validatig the   findByHardDisk......!");
		return this.repo.findById(id);
	}

	@Override
	public LaptopEntity findByBrandAndColour(String brand, String colour) {
		System.out.println("validatig the   findByBrandAndColour......!");

		return this.repo.findByBrandAndColour(brand, colour);
	}

	@Override
	public LaptopEntity findByRamSizeAndId(int ramSize, int id) {
		System.out.println("validatig the   findByBrandAndColour......!");

		return this.repo.findByRamSizeAndId(ramSize, id);
	}

	@Override
	public String findBrandByColour(String colour) {
		System.out.println("validatig the findByBrandAndColour......!");
		return this.repo.findBrandByColour(colour);
	}

	@Override
	public Object[] findColourAndRamSizeByBrand(String brand) {
		System.out.println("validatig the   findColourAndRamSizeByBrand......!");

		return this.repo.findColourAndRamSizeByBrand(brand);
	}

	@Override
	public void updateBrandByColour(String brand, String colour) {
		System.out.println("validatig the updateBrandByColour......!");
		this.repo.updateBrandByColour(brand, colour);

	}

	@Override
	public void updateRamSizeByHardDisk(int ramSize, int hardDisk) {
		System.out.println("validatig the updateRamSizeByHardDisk......!");
		repo.updateRamSizeByHardDisk(ramSize, hardDisk);

	}

	@Override
	public void deleteById(int id) {
		System.out.println("validatig the updateRamSizeByHardDisk......!");
		repo.deleteById(id);
	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("validatig the deleteByBrand......!");
		repo.deleteByBrand(brand);

	}

}

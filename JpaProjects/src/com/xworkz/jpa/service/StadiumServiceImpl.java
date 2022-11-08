package com.xworkz.jpa.service;

import com.xworkz.jpa.constants.Type;
import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.repository.StadiumRepo;
import com.xworkz.jpa.repository.StadiumRepoImpl;

public class StadiumServiceImpl implements StadiumService {

	StadiumRepo repo = new StadiumRepoImpl();

	@Override
	public boolean validationAndSave(StadiumEntity entity) {
		System.out.println("Stadium validation method running");

		int id = entity.getId();
		String name = entity.getName();
		int foundedYear = entity.getFoundedYear();
		Double entryFees = entity.getEntryFees();
		int capacity = entity.getCapacity();
		Type type = entity.getType();

		if (id > 0 && id < 500) {
			System.out.println("id is valid");
		

		} if (name != null && name.length() > 3 && name.length() < 50) {
			System.out.println("name is valid");
		}  if (foundedYear > 1800 && foundedYear < 2023) {
			System.out.println("founded year is valid");
		}  if (entryFees > 1000.00 && entryFees < 50000.00) {
			System.out.println("entryFees is valid");
		} if (capacity > 10000 && capacity < 1000000) {
			System.out.println("capacity is valid");
		}  if (type != null) {
			System.out.println("Type is valid");
			this.repo.save(entity);
		} else {
			System.out.println("argument is in valid");

		}

		return true;
	}

}

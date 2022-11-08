package com.xworkz.ownProject.service;

import com.xworkz.ownProject.entity.BusEntity;

public class BusServiceImpl implements BusService {

	@Override
	public boolean saveAndValidation(BusEntity busEntity) {
		int id = busEntity.getId();
		String name = busEntity.getName();
		String driverName = busEntity.getDriverName();
		if (id > 0) {
			System.out.println("Id is valid");
		}

		else {
			return false;
		}

		if (name != null && name.length() > 3 && name.length() < 20) {
			System.out.println("name is valid");
		} else {
			return false;
		}
		if (driverName != null && driverName.length() > 3 && driverName.length() < 20) {
			System.out.println(" driverName is valid");
		} else {
			return false;
		}

		return false;
	}

}

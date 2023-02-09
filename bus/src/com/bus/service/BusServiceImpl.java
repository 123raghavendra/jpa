package com.bus.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import com.bus.entity.BusEntity;
import com.bus.repo.BusRepo;
import com.bus.repo.BusRepoImpl;

public class BusServiceImpl implements BusService {

	BusRepo repo = new BusRepoImpl();

	@Override
	public boolean validAndSave(BusEntity entity) {
		// TODO Auto-generated method stub

		boolean save = repo.save(entity);
		System.out.println(save);
		return true;
	}

	@Override
	public BusEntity findById(int id) {
		// TODO Auto-generated method stub
		BusEntity findById = repo.findById(id);
		System.out.println(findById);
		return null;
	}

	@Override
	public BusEntity findBybusName(String busName) {
		// TODO Auto-generated method stub
		System.out.println("returning from repo");
		BusEntity findBybusName = repo.findBybusName(busName);
		System.out.println(findBybusName);
		return null;
	}

	@Override
	public BusEntity findByColour(String colour) {
		// TODO Auto-generated method stub
		System.out.println("FindBycolour validating ......!");
		BusEntity findByColour = repo.findByColour(colour);
//		System.out.println(findByColour);

		return null;
	}

	@Override
	public List<BusEntity> readAll() {

		return repo.readAll();
	}

	@Override
	public Optional<BusEntity> findByNumberAndBusName(int number, String busName) {
		// TODO Auto-generated method stub
		System.out.println("service class running findByNumberAndBusName");
		Optional<BusEntity> findByNumberAndBusName = repo.findByNumberAndBusName(number, busName);

		return findByNumberAndBusName;
	}

	@Override
	public String findColourByBusName(String busName) {
		// TODO Auto-generated method stub
		System.out.println("finding the details");
		String findColourByBusName = repo.findColourByBusName(busName);
		System.out.println(findColourByBusName);
		return findColourByBusName;
	}

	@Override
	public int findNumberById(int id) {
		// TODO Auto-generated method stub
		System.out.println("finding the findNumberById");
		int findNumberById = repo.findNumberById(id);
		return findNumberById;
	}

	@Override
	public void updateColourByNumber(String newColour, int number) {
		repo.updateColourByNumber(newColour, number);

	}

	@Override
	public void updateBusNameAndNumberById(String newBusName, int newNumber, int id) {
		// TODO Auto-generated method stub
		repo.updateBusNameAndNumberById(newBusName, newNumber, id);

	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
		
	}

}

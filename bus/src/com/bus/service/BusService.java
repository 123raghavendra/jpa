package com.bus.service;

import java.util.List;
import java.util.Optional;

import com.bus.entity.BusEntity;

public interface BusService {

	boolean validAndSave(BusEntity entity);// save operation

	BusEntity findById(int id);// read by id query is not required

	BusEntity findBybusName(String busName); // read by busname query is required

	BusEntity findByColour(String colour);// read by colour query is required

	List<BusEntity> readAll();

	Optional<BusEntity> findByNumberAndBusName(int number, String busName);// read by number and busName

	String findColourByBusName(String busName);

	int findNumberById(int id);// finding the BusNumber By id

	void updateColourByNumber(String newColour, int number);// always void

	void updateBusNameAndNumberById(String newBusName, int newNumber, int id);// updating the Busname and Number by
																				// using id. always update and delete
																				// method does not have return type
																				// always void

	void deleteById(int id);

}

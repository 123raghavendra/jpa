package com.bus.repo;

import java.util.List;
import java.util.Optional;

import com.bus.entity.BusEntity;

public interface BusRepo {

	boolean save(BusEntity entity);// save method

	BusEntity findById(int id);// read by id query is not required

	BusEntity findBybusName(String busName); // read by busname query is required

	BusEntity findByColour(String colour);// read by colour query is required

	default Optional<BusEntity> findByNumberAndBusName(int number, String busName) {
		return Optional.empty();
	}

	List<BusEntity> readAll();// read all data

	String findColourByBusName(String busName);// finding the colour by using busName

	int findNumberById(int id);// finding the BusNumber By id

	void updateColourByNumber(String newColour, int number);// always void

	void updateBusNameAndNumberById(String newBusName, int newNumber, int id);// updating the Busname and Number by
																				// using id. always update and delete
																				// method does not have return type
																				// always void

	void deleteById(int id);

}

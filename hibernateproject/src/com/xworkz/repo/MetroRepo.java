package com.xworkz.repo;

import java.util.List;

import com.xworkz.entity.MetroEntity;

public interface MetroRepo {

	boolean save(MetroEntity entity);

	List<MetroEntity> findByMetroName(String metroName);

	List<MetroEntity> findByColour(String colour);

	MetroEntity findByPrice(Double price);

	String findMetroNameByNoOfSeats(int noOfSeats);

	String findColourBynoOfSeatsAndprice(int noOfSeats, Double price);

	MetroEntity findBymetroNameAndprice(String metroName, double price);

	List<String> findAllColour();

	List<Double> findAllprice();

	void updateColourByNoOfSeats(String colour, int noOfSeats);

	void deleteByColour(String colour);

}

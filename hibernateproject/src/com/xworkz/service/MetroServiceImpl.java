package com.xworkz.service;

import java.util.List;

import com.xworkz.entity.MetroEntity;
import com.xworkz.repo.MetroRepo;
import com.xworkz.repo.MetroRepoImpl;

public class MetroServiceImpl implements MetroService {

	MetroRepo repo = new MetroRepoImpl();

	@Override
	public boolean save(MetroEntity entity) {
		System.out.println("validating the save method");
		return repo.save(entity);
	}

	@Override
	public List<MetroEntity> findByMetroName(String metroName) {
		System.out.println("validating findByMetroName method");
		return repo.findByMetroName(metroName);
	}

	@Override
	public List<MetroEntity> findByColour(String colour) {
		System.out.println("validating findByColour method");
		return repo.findByColour(colour);
	}

	@Override
	public MetroEntity findByPrice(double price) {
		System.out.println("validating findByPrice method");
		return repo.findByPrice(price);
	}

	@Override
	public String findMetroNameByNoOfSeats(int noOfSeats) {
		System.out.println("validating findMetroNameByNoOfSeats method");
		return repo.findMetroNameByNoOfSeats(noOfSeats);
	}

	@Override
	public String findColourBynoOfSeatsAndprice(int noOfSeats, Double price) {
		System.out.println("validating findColourBynoOfSeatsAndprice method");

		return repo.findColourBynoOfSeatsAndprice(noOfSeats, price);
	}

	@Override
	public MetroEntity findBymetroNameAndprice(String metroName, double price) {
		System.out.println("validating findBymetroNameAndprice method");
		return repo.findBymetroNameAndprice(metroName, price);
	}

	@Override
	public List<String> findAllColour() {

		return repo.findAllColour();
	}

	@Override
	public List<Double> findAllprice() {
		// TODO Auto-generated method stub
		return repo.findAllprice();
	}

	@Override
	public void updateColourByNoOfSeats(String colour, int noOfSeats) {
		System.out.println("validating updateColourByNoOfSeats method");
		repo.updateColourByNoOfSeats(colour, noOfSeats);
	}

	@Override
	public void deleteByColour(String colour) {
		// TODO Auto-generated method stub
		System.out.println("deleting the entity by colour ");

		repo.deleteByColour(colour);

	}

}

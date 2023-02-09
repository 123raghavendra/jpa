package com.xworkz.runner;

import java.util.List;

import com.xworkz.entity.MetroEntity;
import com.xworkz.service.MetroService;
import com.xworkz.service.MetroServiceImpl;

public class Runner {

	public static void main(String[] args) {

		MetroService metroService = new MetroServiceImpl();
//		MetroEntity entity = new MetroEntity(1, "bengaluruMetro", 100, 4000, "red", false);
//		MetroEntity entity1 = new MetroEntity(2, "dubaiMetro", 200, 4000, "red", true);
//		MetroEntity entity2 = new MetroEntity(3, "mumbaiMetro", 200, 4500, "green", true);
//		MetroEntity entity3 = new MetroEntity(4, "nagarbaviMetro", 300, 5500, "red", false);
//		MetroEntity entity4 = new MetroEntity(5, "banashankariMetro", 400, 5500, "red", false);
//		MetroEntity entity5 = new MetroEntity(6, "mysuruMetro", 500, 4500, "green", false);
//		MetroEntity entity6 = new MetroEntity(7, "bengaluruMetro", 600, 4500, "blue", true);
//		MetroEntity entity7 = new MetroEntity(8, "bengaluruMetro", 300, 5000, "black", true);
//
//		// boolean save = metroService.save(entity);
//		// System.out.println(save);
//
//		// boolean save2 = metroService.save(entity1);
//		// System.out.println(save2);
//
//		boolean save3 = metroService.save(entity3);
//		System.out.println(save3);
//
//		boolean save4 = metroService.save(entity4);
//		System.out.println(save4);
//
//		boolean save5 = metroService.save(entity5);
//		System.out.println(save5);
//
//		boolean save6 = metroService.save(entity6);
//		System.out.println(save6);
//
//		boolean save7 = metroService.save(entity7);
//		System.out.println(save7);
//
//		boolean save8 = metroService.save(entity2);
//		System.out.println(save8);

		// List<MetroEntity> findByMetroName =
		// metroService.findByMetroName("bengaluruMetro");
		// System.out.println(findByMetroName);

		// List<MetroEntity> colour= metroService.findByColour("red");
		// System.out.println(colour);

		// MetroEntity findByPrice = metroService.findByPrice(100);
		// System.out.println(findByPrice);

		// String findMetroNameByNoOfSeats =
		// metroService.findMetroNameByNoOfSeats(5000);
		// System.out.println(findMetroNameByNoOfSeats);

		// String findColourBynoOfSeatsAndprice =
		// metroService.findColourBynoOfSeatsAndprice(5500, 300.00);
		// System.out.println(findColourBynoOfSeatsAndprice);

//		MetroEntity findBymetroNameAndprice = metroService.findBymetroNameAndprice("banashankariMetro", 400);
//		System.out.println(findBymetroNameAndprice);

		// List<String> findAllColour = metroService.findAllColour();
		// System.out.println(findAllColour);

		//List<Double> findAllprice = metroService.findAllprice();
	//	System.out.println(findAllprice);
		
		
		//metroService.updateColourByNoOfSeats("black", 4000);
		
		metroService.deleteByColour("black");
	}

}

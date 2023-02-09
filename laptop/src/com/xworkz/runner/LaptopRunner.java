package com.xworkz.runner;

import com.xworkz.entity.LaptopEntity;
import com.xworkz.service.LaptopService;
import com.xworkz.service.LaptopServiceImpl;

public class LaptopRunner {

	public static void main(String[] args) {

		LaptopService service = new LaptopServiceImpl();

//		LaptopEntity entity = new LaptopEntity(1, "dell", "black", 4, false, 500);
//		// System.out.println(entity);
//		LaptopEntity entity1 = new LaptopEntity(2, "Hp", "black", 2, false, 500);
//		LaptopEntity entity2 = new LaptopEntity(3, "Hp", "brown", 6, true, 1000);
//		LaptopEntity entity3 = new LaptopEntity(4, "dell", "Red", 8, true, 1500);
//		LaptopEntity entity4 = new LaptopEntity(5, "apple", "black", 4, false, 200);
//		LaptopEntity entity5 = new LaptopEntity(6, "Samsung", "purple", 2, true, 300);
//		LaptopEntity entity6 = new LaptopEntity(7, "Sony", "Green", 4, false, 500);
//		LaptopEntity entity7 = new LaptopEntity(8, "dell", "voilet", 2, true, 600);
//		LaptopEntity entity8 = new LaptopEntity(9, "Lenova", "white", 6, false, 800);
//		LaptopEntity entity9 = new LaptopEntity(10, "Hp", "Red", 4, true, 1500);
//
//		// service.save(entity);
//		service.save(entity1);
//		service.save(entity2);
//		service.save(entity3);
//		service.save(entity4);
//		service.save(entity5);
//		service.save(entity6);
//		service.save(entity7);
//		service.save(entity8);
//		service.save(entity9);
//
//		System.out.println(service.readAll(entity));
//		for (String string : args) {
//			System.out.println(string);
//		}
//
		// LaptopEntity findByBrand = service.findByBrand("dell");
//		System.out.println(findByBrand);
//
//		LaptopEntity findByColour = service.findByColour("black");
//		System.out.println(findByColour);

//		LaptopEntity findByHardDisk = service.findByHardDisk(500);
//
//		System.out.println(findByHardDisk);

		// LaptopEntity findById = service.findById(9);
		// System.out.println(findById);

		// LaptopEntity findByBrandAndColour = service.findByBrandAndColour("Hp",
		// "black");
		// System.out.println(findByBrandAndColour);

		// LaptopEntity findByRamSizeAndId = service.findByRamSizeAndId(6, 3);
		// System.out.println(findByRamSizeAndId);

		//String findBrandByColour = service.findBrandByColour("purple");
		//System.out.println(findBrandByColour);

//		Object[] findColourAndRamSizeByBrand = service.findColourAndRamSizeByBrand("Samsung");
//		System.out.println(findColourAndRamSizeByBrand[0]);
//		System.out.println(findColourAndRamSizeByBrand[1]);
		
		
	//	service.updateBrandByColour("chidu", "black");
		
	//	service.updateRamSizeByHardDisk(10, 1500);
		
	//	service.deleteById(2);
		
		service.deleteByBrand("dell");

	}

}

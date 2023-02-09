package com.bus.runner;

import java.util.List;
import java.util.Optional;

import com.bus.entity.BusEntity;
import com.bus.service.BusService;
import com.bus.service.BusServiceImpl;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BusService service = new BusServiceImpl();

//		BusEntity entity = new BusEntity("chidu", 991919, "kkkkkk");
//		BusEntity entity1 = new BusEntity("rohan", 99999, "mmmmmm");
//		BusEntity entity2 = new BusEntity("chidu", 10101, "kkkkkk");
//		BusEntity entity3 = new BusEntity("mylari", 4414141, "nnnnnn");
//		BusEntity entity4 = new BusEntity("abhi", 66666, "ooooo");
//		BusEntity entity5 = new BusEntity("xyz", 99999, "pppppp");
//
//		System.out.println(service.validAndSave(entity));
//		System.out.println(service.validAndSave(entity1));
//		System.out.println(service.validAndSave(entity2));
//		System.out.println(service.validAndSave(entity3));
//		System.out.println(service.validAndSave(entity4));
//		System.out.println(service.validAndSave(entity5));

//		System.out.println("=================================");
//		BusEntity findById = service.findById(1);
//		System.out.println(findById);
////
//		System.out.println("=================================");
//		BusEntity findBybusName = service.findBybusName("rohan");
//		System.out.println(findBybusName);
//
//		BusEntity findByColour = service.findByColour("ooooo");
//		System.out.println(findByColour);

		// List<BusEntity> readAll1 = service.readAll();
		// System.out.println(readAll1);

		// Optional<BusEntity> findByNumberAndBusName =
		// service.findByNumberAndBusName(10101, "xyz");
		// System.out.println(findByNumberAndBusName);

		// String findColourByBusName = service.findColourByBusName("mylari");
		// System.out.println(findColourByBusName);

		//int findNumberById = service.findNumberById(2);
		//System.out.println(findNumberById);

		
		//service.updateColourByNumber("purple",99999);
		
		//service.updateBusNameAndNumberById("redBus", 9787, 3);
		
		
		service.deleteById(6);
	}

}

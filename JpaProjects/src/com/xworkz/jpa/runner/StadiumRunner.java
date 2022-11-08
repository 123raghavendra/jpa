package com.xworkz.jpa.runner;

import com.xworkz.jpa.constants.Type;
import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.service.StadiumService;
import com.xworkz.jpa.service.StadiumServiceImpl;

public class StadiumRunner {

	public static void main(String[] args) {

		StadiumEntity entity = new StadiumEntity(1, "ChinaswamiStadium", 1900, 20000, 15000.00, Type.CRICKET);
		StadiumEntity entity1 = new StadiumEntity(2, "Gymkhana Ground", 1933, 15000, 15000.00, Type.FOOTBALL);
		StadiumEntity entity2 = new StadiumEntity(3, "Eden gardens", 1934, 67000, 20000.00, Type.HOCKEY);
		StadiumEntity entity3 = new StadiumEntity(4, "GreenParkStadium", 1952, 45000, 18000.00, Type.TENNIS);
		StadiumEntity entity4= new StadiumEntity(5, "GandiStadium", 1981, 16000, 10000.00, Type.BASKETBALL);
		

		System.out.println(entity);
		System.out.println(entity1);
		System.out.println(entity2);
		System.out.println(entity3);
		System.out.println(entity4);

		
		
		
		StadiumService service = new StadiumServiceImpl();
		service.validationAndSave(entity);
		service.validationAndSave(entity1);
		service.validationAndSave(entity2);
		service.validationAndSave(entity3);
		service.validationAndSave(entity4);

	}

}

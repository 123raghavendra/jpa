package com.xworkz.jpa.runner;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.service.MetroService;
import com.xworkz.jpa.service.MetroServiceImpl;

public class MetroRunner {

	public static void main(String[] args) {

		MetroEntity entity=new MetroEntity(1, "NamaMetro", true, true, "Green", 6, 8, 7.00, 5000, true);
		MetroEntity entity1=new MetroEntity(1, "NamaMetro", true, true, "Orange", 9, 10, 10.00, 8000, true);
		
		System.out.println(entity);
		System.out.println(entity1);

		
		MetroService metroService=new MetroServiceImpl();
		metroService.validAndSave(entity);
		metroService.validAndSave(entity1);

	}

}

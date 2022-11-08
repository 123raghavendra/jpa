package com.xworkz.jpa.runner;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.service.HumanService;
import com.xworkz.jpa.service.HumanServiceImpl;

public class HumanRunner {

	public static void main(String[] args) {

		HumanEntity entity = new HumanEntity(1, "Raghavendra", 29, "developer", 40000.00, true, "black", true, "5.3ft",
				63.00, true, true, true, true, true);
		HumanEntity entity1 = new HumanEntity(2, "Ramesh", 29, "developer", 40000.00, true, "black", true, "5.3ft",
				63.00, true, true, true, true, true);
		System.out.println(entity);
		System.out.println(entity1);

		HumanService humanService = new HumanServiceImpl();
		humanService.validationAndSave(entity);
		humanService.validationAndSave(entity1);
		System.out.println("---------------------------------------------");
		
		Optional<HumanEntity> findById = humanService.findById(2);
		if(findById.isPresent()) {
			System.out.println("id is present"+findById);
		}else {
			System.out.println("id is not present");
		}

	}

}

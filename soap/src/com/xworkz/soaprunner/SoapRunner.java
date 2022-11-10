package com.xworkz.soaprunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.xworkz.soapentity.SoapEntity;
import com.xworkz.soapservice.SoapService;
import com.xworkz.soapservice.SoapServiceImpl;

public class SoapRunner {

	public static void main(String[] args) {

		// create method calling
		SoapEntity entity = new SoapEntity(1, "santoor", 20.00, LocalDate.of(2020, 12, 20), "bengaluru");
		SoapEntity entity1 = new SoapEntity(2, "lux", 30.00, LocalDate.of(2022, 10, 10), "shivamogga");
		SoapEntity entity2 = new SoapEntity(3, "medimux", 40.00, LocalDate.of(2020, 11, 20), "mangaluru");
		SoapEntity entity3 = new SoapEntity(4, "lifeboy", 50.00, LocalDate.of(2000, 1, 11), "gadag");
		SoapEntity entity4 = new SoapEntity(12, "maxz", 35.00, LocalDate.now(), "hubli");

		System.out.println(entity);
		System.out.println("==========================");
		System.out.println(entity1);
		System.out.println("==========================");
		System.out.println(entity2);
		System.out.println("==========================");
		System.out.println(entity3);
		System.out.println("==========================");
		System.out.println(entity4);
		System.out.println("==========================");

		SoapService service = new SoapServiceImpl();

		service.validationAndSave(entity);
		System.out.println("==========================");
		service.validationAndSave(entity1);
		System.out.println("==========================");
		service.validationAndSave(entity2);
		System.out.println("==========================");

		service.validationAndSave(entity3);
		System.out.println("==========================");
		service.validationAndSave(entity4);
		System.out.println("==========================");

		// read operation calling - --> read operation calling method is find by id

		System.out.println(" Read operation is running");
		Optional<SoapEntity> findById = service.findById(3);
		if (findById.isPresent()) {
			System.out.println("Id is found" + findById);
		} else {
			System.out.println("Id is not found");
		}

		System.out.println(" Update Operation Is running");
		// update operation calling service.
		service.updateBrandById(5, "dettol");

		System.out.println(" Delete operation is running");
		// delete operation calling
		service.deleteById(2);

		// 2 nd save method calling by
		List<SoapEntity> list = new ArrayList<>();
		list.add(entity4);
		service.save(list);

	}

}

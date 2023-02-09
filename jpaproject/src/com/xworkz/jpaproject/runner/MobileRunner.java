package com.xworkz.jpaproject.runner;

import java.util.Optional;

import com.xworkz.jpaproject.entity.MobileEntity;
import com.xworkz.jpaproject.service.MobileService;
import com.xworkz.jpaproject.service.MobileServiceImpl;

public class MobileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	MobileEntity entity=new MobileEntity( "dell", 20000.0, "black", 2, true);
	    MobileEntity entity1=new MobileEntity("onida", 16000.0, "black3", 2, false);
//		MobileEntity entity2=new MobileEntity("apple", 14000.0, "black2", 4, false);
//		MobileEntity entity3=new MobileEntity("sony", 12000.0, "black1", 2, true);
//		MobileEntity entity4=new MobileEntity("sony", 11000.0, "black", 2, true);
//		MobileEntity entity5=new MobileEntity("oppo", 12000.0, "blue", 3, false);
//		MobileEntity entity6=new MobileEntity("abcd", 16000.0, "brown", 6, true);
//		MobileEntity entity7=new MobileEntity("samsung", 18000.0, "blue", 4, false);

	

		MobileService service=new MobileServiceImpl();
	//	service.validAndSave(entity);
	 //   service.validAndSave(entity1);
//		service.validAndSave(entity2);
//		service.validAndSave(entity3);
//		service.validAndSave(entity4);
//		service.validAndSave(entity5);
//		service.validAndSave(entity6);
//		service.validAndSave(entity7);

//		Optional<MobileEntity> findById = service.findById(3);
//		System.out.println(findById);
		
		service.updateBrandById(1, "raghu");
		
	    
	}

}

package com.xworkz.soapservice;

import java.util.Optional;

import com.xworkz.soapentity.SoapEntity;

public interface SoapService {
	// create
	boolean validationAndSave(SoapEntity entity);
   //read
	Optional<SoapEntity> findById(int id) ;
   // update 
	 void updateBrandById(int id,String brand) ;
	// delete 
	 void deleteById(int id);
	
	
	
}

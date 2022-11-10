package com.xworkz.soapservice;

import java.util.List;
import java.util.Optional;

import com.xworkz.soapentity.SoapEntity;

public interface SoapService {
	// create
	boolean validationAndSave(SoapEntity entity);
	
	// it is also one of the operation for create .it is used to add list of details . by using add method 
	   default void save(List<SoapEntity>list){
		   
	   }
		   
   //read
	Optional<SoapEntity> findById(int id) ;
   // update 
	 void updateBrandById(int id,String brand) ;
	// delete 
	 void deleteById(int id);
	
	
	
}

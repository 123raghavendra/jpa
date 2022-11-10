package com.xworkz.soaprepository;

import java.util.List;
import java.util.Optional;

import com.xworkz.soapentity.SoapEntity;

public interface SoapRepo {

	boolean  save(SoapEntity entity);
	
   default void save(List<SoapEntity>list){
	  
  }
	
	Optional<SoapEntity> findById(int id) ;
	
	 void updateBrandById(int id,String brand) ;

	 void deleteById(int id);

}

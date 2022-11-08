package com.xworkz.soaprepository;

import java.util.Optional;

import com.xworkz.soapentity.SoapEntity;

public interface SoapRepo {

	boolean  save(SoapEntity entity);
	
	Optional<SoapEntity> findById(int id) ;
	
	 void updateBrandById(int id,String brand) ;

	 void deleteById(int id);

}

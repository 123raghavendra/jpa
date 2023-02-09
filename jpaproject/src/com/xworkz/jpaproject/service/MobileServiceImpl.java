package com.xworkz.jpaproject.service;

import java.util.Optional;

import com.xworkz.jpaproject.entity.MobileEntity;
import com.xworkz.jpaproject.repository.MobileRepo;
import com.xworkz.jpaproject.repository.MobileRepoImpl;

public class MobileServiceImpl implements MobileService {

	MobileRepo repo = new MobileRepoImpl();

	@Override
	public boolean validAndSave(MobileEntity entity) {
		
		return repo.save(entity);
	}

	@Override
	public Optional<MobileEntity> findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Validating the find by id");
		if(id>0) {
			return this.repo.findById(id);
		}
		return Optional.empty();
	}

	@Override
	public void updateBrandById(int id, String brand) {
         repo.updateBrandById(id, brand);
		
	}

	
	
	
	
	
}







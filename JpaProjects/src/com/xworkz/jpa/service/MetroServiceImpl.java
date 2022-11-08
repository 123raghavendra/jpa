package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.repository.MetroRepo;
import com.xworkz.jpa.repository.MetroRepoImpl;

public class MetroServiceImpl implements MetroService {

	MetroRepo metroRepo=new MetroRepoImpl();
	
	
	@Override
	public boolean validAndSave(MetroEntity entity) {
		System.out.println("Validation of metro Service method running ");
		int id = entity.getId();
		String metroName = entity.getMetroName();
		String colour = entity.getColour();
		int noOfCompartment = entity.getNoOfCompartment();
		int noOfPassengers = entity.getNoOfPassengers();
		int noOfStation = entity.getNoOfStation();
		double time = entity.getTimeing();
		boolean announcement = entity.isAnnouncement();
		boolean screen = entity.isScreen();
		boolean security = entity.isSecurityAvailable();

		if(id >0 && id < 500000000) {
			System.out.println("id is valid");
			
		}else {
			return false;
		}
		if( metroName!=null  &&  metroName.length() >3 && metroName.length() <30) {
			System.out.println("metro name is vallid");
		}
		else {
			return false;
		}
		if(colour !=null && colour.length()>3 && colour.length() <50) {
			System.out.println("Colour Is valid ");
		}
		else {
			return false;
		   }
		if(noOfCompartment >0 && noOfCompartment <15) {
			System.out.println("NoOf Component is valid ");
		}
		else {
			return false;
		   }
		if(noOfPassengers >100 && noOfPassengers <15000) {
			System.out.println("No Of passengers is valid ");
		}
		else {
			return false;
		   }
		if(noOfStation >1 && noOfStation <15) {
			System.out.println("no Of station is valid ");
		}
		else {
			return false;
		   }
		if(time >6.00 && time <12.00) {
			System.out.println("time is valid ");
		}
		else {
			return false;
		   }
		if(announcement ==true ||announcement == false) {
			System.out.println("Announcement is valid");
		}
		else {
			return false;
		   }
		if(screen ==true || screen == false) {
			System.out.println("screen is valid");
		}
		else {
			return false;
		   }
		if(security == true || security == false) {
			System.out.println("security is valid ");
		}
		else {
			return false;
		   }
		this.metroRepo.save(entity);
		
		return true;
	}

}

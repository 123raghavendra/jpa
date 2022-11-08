package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.repository.HumanRepo;
import com.xworkz.jpa.repository.HumanRepoImpl;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public class HumanServiceImpl implements HumanService {

	HumanRepo humanRepo = new HumanRepoImpl();

	@Override
	public boolean validationAndSave(HumanEntity entity) {
		System.out.println("Validation sand save method is running sucessfully");
		int id = entity.getId();
		int age = entity.getAge();
		String colour = entity.getColour();
		String height = entity.getHeight();
		String name = entity.getName();
		double salary = entity.getSalary();
		double weight = entity.getWeight();
		String work = entity.getWork();
		boolean alive = entity.isAlive();
		boolean creativeMind = entity.isCreativeMind();
		boolean goodListnear = entity.isGoodListnear();
		boolean honest = entity.isHonest();
		boolean lover = entity.isLover();
		boolean mobile = entity.isMobile();
		boolean responsiblePerson = entity.isResponsiblePerson();

		if (id > 0 && id < 100) {
			System.out.println("id is valid");
		} else {
			return false;
		}
		if (age > 0 && age < 100) {
			System.out.println("age is valid");
		} else {
			return false;
		}
		if (colour.length() > 3 && colour.length() < 30 && colour != null) {
			System.out.println("colour is valid");
		} else {
			return false;
		}
		if (height != null && height.length() > 3 && height.length() < 10) {
			System.out.println("height is valid");
		} else {
			return false;
		}
		if (name.length() > 3 && name.length() < 20 && name != null) {
			System.out.println("name is valid");
		} else {
			return false;
		}

		if (salary > 10000.00 && salary < 100000000) {
			System.out.println("salary is valid");
		} else {

			return false;
		}

		if (weight > 10 && weight < 150) {
			System.out.println("weight is valid");
		} else {
			return false;
		}
		if (work.length() > 3 && work.length() < 30 && work != null) {
			System.out.println("work is valid");
		} else {
			return false;
		}
		if (alive == true || alive == false) {
			System.out.println("alive is valid");
		} else {
			return false;
		}

		if (creativeMind == true || creativeMind == false) {
			System.out.println(" creative mind is valid");
		} else {
			return false;
		}
		if (goodListnear == true || goodListnear == false) {
			System.out.println(" goodlistner is valid");
		} else {
			return false;
		}
		if (honest == true || honest == false) {
			System.out.println(" honest is valid");
		} else {
			return false;
		}

		if (lover == true || lover == false) {
			System.out.println("lover is valid");
		} else {
			return false;
		}
		if (mobile == true || mobile == false) {
			System.out.println("mobile is valid");
		} else {
			return false;
		}
		if (responsiblePerson == true || responsiblePerson == false) {
			System.out.println(" Responsible person is valid");
		} else {
			return false;
		}
		this.humanRepo.save(entity);

		return true;
	}

	@Override
	public java.util.Optional<HumanEntity> findById(int id) {
if(id>0) {
	return this.humanRepo.findById(id);
}
		
		return java.util.Optional.empty();
	}

}

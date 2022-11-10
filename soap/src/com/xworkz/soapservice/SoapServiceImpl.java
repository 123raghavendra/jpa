package com.xworkz.soapservice;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.xworkz.soapentity.SoapEntity;
import com.xworkz.soaprepository.SoapRepo;
import com.xworkz.soaprepository.SoaprRepoImpl;

public class SoapServiceImpl implements SoapService {

	SoapRepo repo = new SoaprRepoImpl();

	@Override
	public boolean validationAndSave(SoapEntity entity) {
		int id = entity.getId();
		String brand = entity.getBrand();
		double price = entity.getPrice();
		LocalDate validatyDate = entity.getValidatyDate();
		String companyLocation = entity.getCompanyLocation();
		if (id > 0 && id < 100) {

			System.out.println("id is valid");
		} else {
			return false;

		}
		if (brand.length() >= 3 && brand.length() < 20 && brand != null) {
			System.out.println("brand is valid");
		} else {
			return false;
		}

		if (price > 10 && price < 100) {
			System.out.println(" price is valid");
		} else {
			return false;
		}

		if (companyLocation != null && companyLocation.length() > 0 && companyLocation.length() < 20) {
			System.out.println(" Company location is valid");
		} else {
			return false;
		}

		this.repo.save(entity);
		return false;
	}

	@Override
	public void save(List<SoapEntity> list) {
		System.out.println("running save method......");
		if (list != null) {
			this.repo.save(list);
		}
		SoapService.super.save(list);
	}

	@Override
	public Optional<SoapEntity> findById(int id) {
		if (id > 0) {
			return this.repo.findById(id);
		}
		return Optional.empty();
	}

	@Override
	public void updateBrandById(int id, String brand) {
		if (id > 0 && brand != null) {
			this.repo.updateBrandById(id, brand);
		}

	}

	@Override
	public void deleteById(int id) {
		if (id > 0) {
			this.repo.deleteById(id);

		}

	}

}

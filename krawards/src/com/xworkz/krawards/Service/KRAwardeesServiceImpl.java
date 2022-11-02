package com.xworkz.krawards.Service;

import javax.security.auth.kerberos.KerberosCredMessage;

import com.xworkz.krawards.Repository.KRAwardsRepo;
import com.xworkz.krawards.Repository.KRAwrdsRepoImpl;
import com.xworkz.krawards.entity.KRAwardsEntity;

public class KRAwardeesServiceImpl implements KRAwardesService {

	private KRAwardsRepo awardsRepo = new KRAwrdsRepoImpl();

	public KRAwardeesServiceImpl() {
		System.out.println("Service constructor was running ");
	}

	@Override
	public boolean validateAndSave(KRAwardsEntity awardsDTO) {
		System.out.println("Validate and save the objects sucessfully");
		int id = awardsDTO.getId();
		String achievement = awardsDTO.getAchievement();
		String name = awardsDTO.getName();
		String place = awardsDTO.getPlace();
		int year = awardsDTO.getYear();
		int age = awardsDTO.getAge();
		boolean alive = awardsDTO.isAlive();

		if (id > 0 && id < 1000) {
			System.out.println("Id is validate and save sucessfully");
			if (achievement != null && achievement.length() > 3 && achievement.length() < 30) {
				System.out.println("achievement is valid");
				if (name != null && name.length() > 3 && name.length() < 30) {
					System.out.println("name is valid");
					if (place != null && place.length() > 3 && place.length() < 30) {
						System.out.println("place is valid");
						if (year > 1800 && year < 2023) {
							System.out.println("year is valid");
							if (age > 20 && age < 100) {
								System.out.println("age is valid");
								if (alive == true || alive == false) {
									System.out.println("alive is valid");

									this.awardsRepo.Save(awardsDTO);
							

								} else {
									System.err.println("alive is invalid");
								}

							} else {
								System.err.println("age is invalid");
							}
						} else {
							System.err.println("year is invalid");
						}
					} else {
						System.err.println("place is in valid");
					}
				} else {
					System.err.println("name is in valid");
				}
			} else {
				System.err.println("achievement is invalid");

			}

		} else {
			System.err.println("id is in valid");
		}

		return true;

	}

}

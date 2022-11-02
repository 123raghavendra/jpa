package com.xworkz.krawards.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.krawards.entity.KRAwardsEntity;

public class KRAwrdsRepoImpl implements KRAwardsRepo {

	@Override
	public boolean Save(KRAwardsEntity awardsDTO) {
		System.out.println("running save method sucessfully");
		EntityManagerFactory enFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = enFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(awardsDTO);
		transaction.commit();
		entityManager.close();
		enFactory.close();

		return true;
	}

}

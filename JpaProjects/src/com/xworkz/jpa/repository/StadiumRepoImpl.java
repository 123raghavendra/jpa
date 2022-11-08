package com.xworkz.jpa.repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpa.entity.StadiumEntity;

public class StadiumRepoImpl implements StadiumRepo {

	@Override
	public boolean save(StadiumEntity entity) {
		System.out.println("Stadium entity save the method");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
		createEntityManager.clear();
		createEntityManagerFactory.close();

		return true;
	}

}

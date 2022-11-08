package com.xworkz.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpa.entity.MetroEntity;

public class MetroRepoImpl implements MetroRepo {

	@Override
	public boolean save(MetroEntity entity) {
		System.out.println("Running save method sucessfully ");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		createEntityManagerFactory.close();
		
		
		
		return true;
	}

}

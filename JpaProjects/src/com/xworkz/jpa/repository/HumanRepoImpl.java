package com.xworkz.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpa.entity.HumanEntity;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public class HumanRepoImpl implements HumanRepo {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
	private HumanEntity find;

	@Override
	public boolean save(HumanEntity entity) {
		System.out.println("Running save method ");

		// EntityManagerFactory createEntityManagerFactory =
		// Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();// persist method and commit method why we wrtten . or what is job of persist
								// and commit method
		entityManager.close();
	//	createEntityManagerFactory.close();

		return true;
	}

	@Override
	public java.util.Optional<HumanEntity> findById(int id) {
		EntityManager manager = createEntityManagerFactory.createEntityManager();
		find = manager.find(HumanEntity.class, id);
		if (find != null) {
			return java.util.Optional.of(find);
		}
		return java.util.Optional.empty();
	}

}

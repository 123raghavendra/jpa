package com.xworkz.jpaproject.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.jpaproject.entity.MobileEntity;
import com.xworkz.jpaproject.singleton.Singleton;

public class MobileRepoImpl implements MobileRepo {

	EntityManagerFactory factory = Singleton.getFactory();

	// Save operation
	@Override
	public boolean save(MobileEntity entity) {
		System.out.println("saveing the details sucessfully");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {

			transaction.begin();
			createEntityManager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();

		} finally {
			createEntityManager.close();

		}
		return true;
	}

	// Read Operation
	@Override
	public Optional<MobileEntity> findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Reading the data from sql");
		EntityManager manager = factory.createEntityManager();
		MobileEntity find = manager.find(MobileEntity.class, id);
		

		if (find != null) {
			return Optional.of(find);
		}

		return Optional.empty();
	}

	// update by brand

	@Override
	public void updateBrandById(int id, String brand) {
		// TODO Auto-generated method stub
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction2 = createEntityManager.getTransaction();
		try {
			transaction2.begin();
			Query query = createEntityManager.createNamedQuery("updateBrandById");
			query.setParameter("br", brand);
			query.setParameter("i", id);
			query.executeUpdate();
			transaction2.commit();

		} catch (

		PersistenceException exception) {

			exception.printStackTrace();
			transaction2.rollback();
		}

		finally {
			createEntityManager.close();
		}
	}
}

package com.xworkz.soaprepository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.service.spi.Manageable;

import com.xworkz.soapentity.SoapEntity;
import com.xworkz.soapsingleton.SoapSingleton;

public class SoaprRepoImpl implements SoapRepo {

	EntityManagerFactory factory = SoapSingleton.getFactory();

	// Write operation implements of jpa
	@Override
	public boolean save(SoapEntity entity) {
		System.out.println(" Saveing details sucessfully");

		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
		createEntityManager.close();
		return true;
	}

// read operation
	@Override
	public Optional<SoapEntity> findById(int id) {
		EntityManager manager = factory.createEntityManager();
		SoapEntity find = manager.find(SoapEntity.class, id);
		if (find != null) {
			return Optional.of(find);
		}
		return Optional.empty();
	}

	// update operation

	@Override
	public void updateBrandById(int id, String brand) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		SoapEntity find = manager.find(SoapEntity.class, id);

		if (find != null) {
			find.setBrand(brand);

			manager.persist(find);
			transaction.commit();
			manager.close();

		}
	}
// delete method impl
	@Override
	public void deleteById(int id) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		SoapEntity find = createEntityManager.find(SoapEntity.class, id);
		if (find != null) {
			find.setId(id);
			createEntityManager.remove(find);
			transaction.commit();
			createEntityManager.close();
		}

	}

}

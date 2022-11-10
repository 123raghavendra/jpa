package com.xworkz.soaprepository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;

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
		
		try {
		transaction.begin();
		createEntityManager.persist(entity);
		
		
		transaction.commit();
		
		}catch(PersistenceException exception) {
			
			exception.printStackTrace();
			//transaction.rollback();
		}
		
		
	finally {
		createEntityManager.close();
		}
	
		return true;
	}

// save the details by  list and add method is used
	@Override
	public void save(List<SoapEntity> list) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			for (SoapEntity entity : list) {
				manager.persist(entity);
			}
			transaction.commit();
		}
		catch (PersistenceException e) {
			transaction.rollback();
		}
		finally {

		}

		SoapRepo.super.save(list);
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
		try {
			transaction.begin();

			SoapEntity find = manager.find(SoapEntity.class, id);

			if (find != null) {
				find.setBrand(brand);
				manager.persist(find);
			}
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
	
		}

		finally {
			manager.close();
		}

	}

// delete method impl
	@Override
	public void deleteById(int id) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
	
		try {
		transaction.begin();
		SoapEntity find = createEntityManager.find(SoapEntity.class, id);
		if (find != null) {
			find.setId(id);
			createEntityManager.remove(find);
		
		}
		transaction.commit();
		}	
		catch(PersistenceException persistenceException){
			persistenceException.printStackTrace();
			transaction.rollback();
		}
			
		finally {
			createEntityManager.close();
		}

	

}
}
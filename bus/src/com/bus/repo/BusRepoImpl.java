package com.bus.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.bus.entity.BusEntity;
import com.bus.singleton.Singleton;

public class BusRepoImpl implements BusRepo {

	EntityManagerFactory factory = Singleton.getFactory();
	private Object singleResult;

	// save operation
	@Override
	public boolean save(BusEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Save the data sucessfully");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();// it is used to transaction
																				// (example:amount bank transation)

		try {
			transaction.begin();// begain means start

			createEntityManager.persist(entity);// save agle antha helede
			transaction.commit();// no changes in sql
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		finally {
			createEntityManager.close();// account close agle antha heluthe
		}

		return true;

	}

// read by id
	@Override
	public BusEntity findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("find bY id is running........!");
		EntityManager createEntityManager = factory.createEntityManager();
		BusEntity find = createEntityManager.find(BusEntity.class, id);// i didnt understand
		if (find != null) {
			return find;
		}

		return null;
	}

	// read by busName

	@Override
	public BusEntity findBybusName(String busName) {
		// TODO Auto-generated method stub
		System.out.println("FindBy Bus Name is running ......!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query query = createEntityManager.createNamedQuery("findByBusName");
		query.setParameter("ab", busName);
		Object object = query.getSingleResult();
		if (object != null) {
			BusEntity busEntity = (BusEntity) object;
			return busEntity;
		}

		return null;
	}

	// read by colour
	@Override
	public BusEntity findByColour(String colour) {
		// TODO Auto-generated method stub
		System.out.println("findByColour is running from sql........!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByColour");
		createNamedQuery.setParameter("cd", colour);
		Object object = createNamedQuery.getResultList();
		System.out.println(object);
//		if (object != null) {
//			BusEntity busEntity = (BusEntity) object;
//			return busEntity;
//		}

		return null;
	}

	// read by number and busName
	@Override
	public Optional<BusEntity> findByNumberAndBusName(int number, String busName) {
		// TODO Auto-generated method stub
		System.out.println("running  findByNumberAndBusName......!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByNumberAndBusName");
		createNamedQuery.setParameter("jk", number);
		createNamedQuery.setParameter("lm", busName);
		Object object = createNamedQuery.getSingleResult();

		BusEntity entity = (BusEntity) object;

		return Optional.of(entity);

	}

	@Override
	public List<BusEntity> readAll() {
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("readAll");
		List resultList = createNamedQuery.getResultList();

		return resultList;
	}

	@Override
	public String findColourByBusName(String busName) {
		// TODO Auto-generated method stub
		System.out.println("running the findColourByBusName");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findColourByBusName");
		Query setParameter = createNamedQuery.setParameter("nb", busName);
		Object object = setParameter.getSingleResult();
		if (object != null) {
			String string = (String) object;
			return string;
		}
		return null;
	}

	@Override
	public int findNumberById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Running the findNumberById.......!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findNumberById");
		Query setParameter = createNamedQuery.setParameter("cc", id);
		Object object = setParameter.getSingleResult();
		if (object != null) {
			int ab = (int) object;
			return ab;
		}

		return 0;
	}

	@Override
	public void updateColourByNumber(String newColour, int number) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query query = createEntityManager.createNamedQuery("updateColourByNumber");
		query.setParameter("n", number);
		query.setParameter("c", newColour);

		query.executeUpdate();
		transaction.commit();

	}

	@Override
	public void updateBusNameAndNumberById(String newBusName, int newNumber, int id) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("updateBusNameAndNumberById");
		createNamedQuery.setParameter("p", id);
		createNamedQuery.setParameter("b", newNumber);
		createNamedQuery.setParameter("o", newBusName);
		createNamedQuery.executeUpdate();
		transaction.commit();

	}

	@Override
	public void deleteById(int id) {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("deleteById");
		createNamedQuery.setParameter("i", id);
		createNamedQuery.executeUpdate();
		transaction.commit();

	}
}

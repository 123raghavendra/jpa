package com.xworkz.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.print.attribute.standard.Sides;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.entity.MetroEntity;
import com.xworkz.hibernate.util.HibernateUtil;

public class MetroRepoImpl implements MetroRepo {

	SessionFactory factory = HibernateUtil.getSessionFactory();
	private List resultList;

	@Override
	public boolean save(MetroEntity entity) {
		System.out.println("save the metro entity details");
		Session openSession = factory.openSession();
		Transaction transaction = openSession.getTransaction();
		transaction.begin();
		openSession.save(entity);
		transaction.commit();

		return true;
	}

	@Override
	public List<MetroEntity> findByMetroName(String metroName) {
		System.out.println(" findByMetroName details");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByMetroName");
		createNamedQuery.setParameter("mn", metroName);
		List resultList = createNamedQuery.getResultList();

		if (resultList != null) {
			List list = (List) resultList;
			return resultList;

		}

		return null;
	}

	@Override
	public List<MetroEntity> findByColour(String colour) {
		System.out.println(" findByColour details");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByColour");
		Query setParameter = createNamedQuery.setParameter("co", colour);
		List resultList = setParameter.getResultList();

		if (resultList != null) {
			List list = (List) resultList;
			return list;
		}

		return null;
	}

	@Override
	public MetroEntity findByPrice(Double price) {
		System.out.println(" findByPrice details");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByPrice");
		createNamedQuery.setParameter("pr", price);
		Object singleResult = createNamedQuery.getSingleResult();
		if (singleResult != null) {
			MetroEntity mEntity = (MetroEntity) singleResult;
			return mEntity;
		}

		return null;
	}

	@Override
	public String findMetroNameByNoOfSeats(int noOfSeats) {
		System.out.println(" findMetroNameByNoOfSeats details");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findMetroNameByNoOfSeats");
		createNamedQuery.setParameter("ms", noOfSeats);
		Object singleResult = createNamedQuery.getSingleResult();
		if (singleResult != null) {
			String string = (String) singleResult;
			return string;
		}

		return null;
	}

	@Override
	public String findColourBynoOfSeatsAndprice(int noOfSeats, Double price) {
		System.out.println(" findMetroNameByNoOfSeats details");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findColourBynoOfSeatsAndprice");
		createNamedQuery.setParameter("ns", noOfSeats);
		createNamedQuery.setParameter("pr", price);
		Object singleResult = createNamedQuery.getSingleResult();
		if (singleResult != null) {
			String string = (String) singleResult;
			return string;
		}

		return null;
	}

	@Override
	public MetroEntity findBymetroNameAndprice(String metroName, double price) {
		System.out.println(" findBymetroNameAndprice details");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findBymetroNameAndprice");
		createNamedQuery.setParameter("mn", metroName);
		createNamedQuery.setParameter("pr", price);
		Object singleResult = createNamedQuery.getSingleResult();
		if (singleResult != null) {
			MetroEntity entity = (MetroEntity) singleResult;
			return entity;
		}

		return null;
	}

	@Override
	public List<String> findAllColour() {
		EntityManager createEntityManager = factory.createEntityManager();
		Query query = createEntityManager.createNamedQuery("findAllColour");
		List list = query.getResultList();
		if (list != null) {
			List<String> string = (List<String>) list;
			return string;

		}
		return null;
	}

	@Override
	public List<Double> findAllprice() {
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findAllprice");
		List list = createNamedQuery.getResultList();
		if (list != null) {
			List<Double> list1 = (List<Double>) list;
			return list1;
		}

		return null;
	}

	@Override
	public void updateColourByNoOfSeats(String colour, int noOfSeats) {
		// TODO Auto-generated method stub
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("updateColourByNoOfSeats");
		createNamedQuery.setParameter("co", colour);
		createNamedQuery.setParameter("ns", noOfSeats);
		transaction.commit();

	}

	@Override
	public void deleteByColour(String colour) {
		System.out.println(" deleteByColour details");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("deleteByColour");
		createNamedQuery.setParameter("co", colour);
		createNamedQuery.executeUpdate();
		transaction.commit();

	}

}

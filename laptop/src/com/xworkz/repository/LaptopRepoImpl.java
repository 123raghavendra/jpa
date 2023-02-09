package com.xworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.entity.LaptopEntity;

public class LaptopRepoImpl implements LaptopRepo {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");

	// save operation
	@Override
	public boolean save(LaptopEntity entity) {
		System.out.println("Laptop save method is running");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(entity);
		transaction.commit();
//		createEntityManager.close();

		return true;
	}

	// read all operation

	@Override
	public List<LaptopEntity> readAll() {
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.createNamedQuery("readAll", LaptopEntity.class);
		transaction.commit();
		return null;
	}

	// read by brand

	@Override
	public LaptopEntity findByBrand(String brand) {
		System.out.println("Running findByBrand in repo....!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByBrand");
		Query query = createNamedQuery.setParameter("ab", brand);
		List resultList = query.getResultList();
		System.out.println(resultList);

		return null;
	}

	@Override
	public LaptopEntity findByColour(String colour) {
		System.out.println("Running findByColour in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByColour");
		Query setParameter = createNamedQuery.setParameter("bc", colour);
		List resultList = setParameter.getResultList();
		System.out.println(resultList);

		return null;
	}

	@Override
	public LaptopEntity findByHardDisk(int hardDisk) {
		System.out.println("Running findByHardDisk in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByHardDisk");
		Query setParameter = createNamedQuery.setParameter("jk", hardDisk);
		List resultList = setParameter.getResultList();
		System.out.println(resultList);

		return null;
	}

	@Override
	public LaptopEntity findById(int id) {
		System.out.println("Running findById in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		LaptopEntity find = createEntityManager.find(LaptopEntity.class, id);
		if (find != null) {
			return find;
		}
		return null;
	}

	@Override
	public LaptopEntity findByBrandAndColour(String brand, String colour) {
		System.out.println("Running findByBrandAndColour in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByBrandAndColour");
		createNamedQuery.setParameter("kk", brand);
		createNamedQuery.setParameter("pp", colour);

		Object singleResult = createNamedQuery.getSingleResult();

		// System.out.println(singleResult);
		if (singleResult != null) { // or another way to get result

			LaptopEntity laptopEntity = (LaptopEntity) singleResult;
			return laptopEntity;

		}

		return null;
	}

	@Override
	public LaptopEntity findByRamSizeAndId(int ramSize, int id) {
		System.out.println("Running findByRamSizeAndId in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findByRamSizeAndId");
		createNamedQuery.setParameter("tt", id);
		createNamedQuery.setParameter("uu", ramSize);
		Object obj = createNamedQuery.getSingleResult();
		if (obj != null) {
			LaptopEntity entity = (LaptopEntity) obj;
			System.out.println(entity);
		}

		return null;
	}

	@Override
	public String findBrandByColour(String colour) {
		System.out.println("Running findBrandByColour in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findBrandByColour");
		createNamedQuery.setParameter("cv", colour);
		Object singleResult = createNamedQuery.getSingleResult();
		if (singleResult != null) {
			String string = (String) singleResult;
			return string;
		}

		return null;
	}

	@Override
	public Object[] findColourAndRamSizeByBrand(String brand) {
		System.out.println("Running findColourAndRamSizeByBrand in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		Query createNamedQuery = createEntityManager.createNamedQuery("findColourAndRamSizeByBrand");
		createNamedQuery.setParameter("bb", brand);
		Object singleResult = createNamedQuery.getSingleResult();
		if (singleResult != null) {
			Object[] obj = (Object[]) singleResult;

			return obj;
		}

		return null;
	}

	@Override
	public void updateBrandByColour(String brand, String colour) {
		System.out.println("Running updateBrandByColour in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("updateBrandByColour");
		createNamedQuery.setParameter("d", brand);
		createNamedQuery.setParameter("e", colour);
		createNamedQuery.executeUpdate();
		transaction.commit();

	}

	@Override
	public void updateRamSizeByHardDisk(int ramSize, int hardDisk) {
		System.out.println("Running updateRamSizeByHardDisk in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("updateRamSizeByHardDisk");
		createNamedQuery.setParameter("ra", ramSize);
		createNamedQuery.setParameter("ha", hardDisk);
		createNamedQuery.executeUpdate();
		transaction.commit();

	}

	@Override
	public void deleteById(int id) {
		System.out.println("Running deleteById in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("deleteById");
		createNamedQuery.setParameter("i", id);
		createNamedQuery.executeUpdate();
		transaction.commit();

	}

	@Override
	public void deleteByBrand(String brand) {
		System.out.println("Running deleteByBrand in repo .....!");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		Query createNamedQuery = createEntityManager.createNamedQuery("deleteByBrand");
		createNamedQuery.setParameter("br", brand);
		createNamedQuery.executeUpdate();
		transaction.commit();

	}

}

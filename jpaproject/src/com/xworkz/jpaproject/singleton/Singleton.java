package com.xworkz.jpaproject.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singleton {

	public static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}

}
